package com.fast.us.eight.eighthwallpaper.utils

import android.app.WallpaperManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.graphics.drawable.BitmapDrawable
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import okhttp3.CacheControl
import okhttp3.Call
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okio.IOException
import java.io.OutputStream
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

object SetWallHelp {

    fun setWallpaperFun(
        activity: AppCompatActivity,
        drawable: Int,
        type: Int,
        startSet: () -> Unit,
        setCompat: () -> Unit
    ) {
        activity.lifecycleScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main) {
                startSet()
            }
            val bitmap = loadBitmap(activity, drawable)
            val wallpaperManager = WallpaperManager.getInstance(activity)

            try {
                setWallpaperCompat(wallpaperManager, bitmap, type)
                withContext(Dispatchers.Main) {
                    setCompat()
                    showSuccessToast(activity)
                }

            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showErrorToast(activity)
                }
                e.printStackTrace()
            }
        }
    }

    fun setWallpaperBoth(
        activity: AppCompatActivity,
        drawable: Int,
        startSet: () -> Unit,
        setCompat: () -> Unit
    ) {
        activity.lifecycleScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main) {
                startSet()
            }
            val bitmap = loadBitmap(activity, drawable)
            val wallpaperManager = WallpaperManager.getInstance(activity)

            try {
                setWallpaperCompat(wallpaperManager, bitmap, WallpaperManager.FLAG_LOCK)
                setWallpaperCompat(wallpaperManager, bitmap, WallpaperManager.FLAG_SYSTEM)
                withContext(Dispatchers.Main) {
                    setCompat()
                    showSuccessToast(activity)
                }

            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showErrorToast(activity)
                }
                e.printStackTrace()
            }
        }
    }


    private fun loadBitmap(context: Context, drawableId: Int): Bitmap {
        return BitmapFactory.decodeResource(context.resources, drawableId)
    }

    private suspend fun setWallpaperCompat(
        wallpaperManager: WallpaperManager,
        bitmap: Bitmap,
        type: Int
    ) {
        return withContext(Dispatchers.Main) {
            wallpaperManager.setBitmap(bitmap, null, false, type)
        }
    }

    private fun showSuccessToast(context: Context) {
        Toast.makeText(context, "Set the wallpaper successfully", Toast.LENGTH_SHORT).show()
    }

    private fun showErrorToast(context: Context) {
        Toast.makeText(context, "Failed to set image", Toast.LENGTH_SHORT).show()
    }


    fun saveDrawableToGallery(
        activity: Activity,
        drawableId: Int,
        title: String,
        description: String,
    ) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            if (ContextCompat.checkSelfPermission(
                    activity,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(
                        activity,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                    )
                ) {
                    showPermissionExplanationDialog(activity)
                } else {
                    ActivityCompat.requestPermissions(
                        activity,
                        arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                        1000
                    )
                }
                return
            }
        }
        val bitmap = (ContextCompat.getDrawable(activity, drawableId) as BitmapDrawable).bitmap

        val values = ContentValues().apply {
            put(MediaStore.Images.Media.TITLE, title)
            put(MediaStore.Images.Media.DESCRIPTION, description)
            put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES)
            }
        }

        val uri =
            activity.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)

        uri?.let {
            val outputStream: OutputStream? = activity.contentResolver.openOutputStream(it)
            outputStream?.use { stream ->
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream)
                Toast.makeText(activity, "Image saved to gallery", Toast.LENGTH_SHORT).show()
            }
        }
    }


    fun getBlackNameNet(
        url: String,
        map: Map<String, Any>,
        onNext: (response: String) -> Unit,
        onError: (error: String) -> Unit
    ) {
        val client = OkHttpClient()

        val urlBuilder = url.toHttpUrl().newBuilder()
        map.forEach { entry ->
            urlBuilder.addEncodedQueryParameter(
                entry.key,
                URLEncoder.encode(entry.value.toString(), StandardCharsets.UTF_8.toString())
            )
        }
        val request = Request.Builder()
            .get()
            .tag(map)
            .url(urlBuilder.build())
            .cacheControl(CacheControl.FORCE_NETWORK)
            .build()

        client.newCall(request).enqueue(object : okhttp3.Callback {
            override fun onResponse(call: Call, response: Response) {
                val responseBody = response.body?.string()
                if (response.isSuccessful && responseBody != null) {
                    onNext(responseBody)
                } else {
                    onError(responseBody.toString())
                }
            }

            override fun onFailure(call: Call, e: IOException) {
                onError("Network error")
            }
        })
    }

    private fun showPermissionExplanationDialog(activity: Activity) {
        val builder = AlertDialog.Builder(activity)
        builder.setTitle("Permission requests")
        builder.setMessage("Storage permission is required to save pictures to an album. Please grant permission in the app settings.")
        builder.setPositiveButton("Go to Settings") { _: DialogInterface, _: Int ->
            val intent = android.content.Intent().apply {
                action = android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                data = android.net.Uri.fromParts("package", activity.packageName, null)
            }
            activity.startActivity(intent)
        }
        builder.setNegativeButton("Cancel") { dialog: DialogInterface, _: Int ->
            dialog.dismiss()
        }
        builder.setCancelable(false)
        val dialog = builder.create()
        dialog.show()
    }
}