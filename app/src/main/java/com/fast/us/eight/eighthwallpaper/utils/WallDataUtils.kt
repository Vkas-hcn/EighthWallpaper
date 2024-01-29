package com.fast.us.eight.eighthwallpaper.utils

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import com.fast.us.eight.eighthwallpaper.R
import com.fast.us.eight.eighthwallpaper.base.App

object WallDataUtils {
    const val black_url = "https://marina.wallpaperscenic.com/quote/jew/appendix\n"
    const val pro_url = "https://www.microsoft.com/concern/privacy"
    private val imageList = listOf(
        R.drawable.ic_78,
        R.drawable.ic_79,
        R.drawable.ic_80,
        R.drawable.ic_90,
        R.drawable.ic_91,
        R.drawable.ic_92,
    )
    private val allList = listOf(
        R.drawable.ic_1,
        R.drawable.ic_2,
        R.drawable.ic_3,
        R.drawable.ic_4,
        R.drawable.ic_5,
        R.drawable.ic_6,
        R.drawable.ic_7,
        R.drawable.ic_8,
        R.drawable.ic_9,
        R.drawable.ic_10,
        R.drawable.ic_11,
        R.drawable.ic_12,
        R.drawable.ic_13,
        R.drawable.ic_14,
        R.drawable.ic_15,
        R.drawable.ic_16,
        R.drawable.ic_17,
        R.drawable.ic_18,
        R.drawable.ic_19,
        R.drawable.ic_20,
        R.drawable.ic_21,
        R.drawable.ic_22,
        R.drawable.ic_23,
        R.drawable.ic_24,
        R.drawable.ic_25,
        R.drawable.ic_26,
        R.drawable.ic_27,
        R.drawable.ic_28,
        R.drawable.ic_29,
        R.drawable.ic_30,
        R.drawable.ic_31,
        R.drawable.ic_78,
        R.drawable.ic_79,
        R.drawable.ic_80,
        R.drawable.ic_81,
        R.drawable.ic_82,
        R.drawable.ic_83,
        R.drawable.ic_84,
        R.drawable.ic_85,
        R.drawable.ic_86,
        R.drawable.ic_87,
        R.drawable.ic_88,
        R.drawable.ic_89,
        R.drawable.ic_90,
        R.drawable.ic_91,
        R.drawable.ic_92,
        R.drawable.ic_93,
        R.drawable.ic_94,
        R.drawable.ic_95,
        R.drawable.ic_96,
        R.drawable.ic_97,
        R.drawable.ic_98,
        R.drawable.ic_99,
    )

    fun getBannerList(): List<Int> {
        return imageList
    }

    fun getAllList(): List<Int> {
        return allList
    }

    private val sharedPreferences by lazy {
        App.getAppContext().getSharedPreferences(
            "EighthWallpaper",
            Context.MODE_PRIVATE
        )
    }
    var eighth_id = ""
        set(value) {
            sharedPreferences.edit().run {
                putString("eighth_id", value)
                commit()
            }
            field = value
        }
        get() = sharedPreferences.getString("eighth_id", "").toString()

    var eighth_black_key = ""
        set(value) {
            sharedPreferences.edit().run {
                putString("eighth_black_value", value)
                commit()
            }
            field = value
        }
        get() = sharedPreferences.getString("eighth_black_value", "").toString()

    fun cloakJson(context: Context): Map<String, Any> {
        return mapOf<String, Any>(
            //distinct_id
            "twaddle" to (eighth_id),
            //client_ts
            "crevice" to (System.currentTimeMillis()),
            //device_model
            "vector" to Build.MODEL,
            //bundle_id
            "spill" to ("com.wallpaper.scenic.views.nature"),
            //os_version
            "sprocket" to Build.VERSION.RELEASE,
            //gaid
            "section" to "",
            //android_id
            "eng" to context.getAppId(),
            //os
            "compact" to "kola",
            //app_version
            "vought" to context.getAppVersion(),
            //network_type
            "leopard" to "",
        )
    }


    private fun Context.getAppVersion(): String {
        try {
            val packageInfo = this.packageManager.getPackageInfo(this.packageName, 0)

            return packageInfo.versionName
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        return "Version information not available"
    }

    private fun Context.getAppId(): String {
        return Settings.Secure.getString(
            this.contentResolver,
            Settings.Secure.ANDROID_ID
        )
    }
}