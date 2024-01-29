package com.fast.us.eight.eighthwallpaper.view

import android.app.WallpaperManager
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.fast.us.eight.eighthwallpaper.databinding.ActivityEndBinding
import com.fast.us.eight.eighthwallpaper.utils.SetWallHelp
import com.fast.us.eight.eighthwallpaper.utils.WallDataUtils

class EndActivity : AppCompatActivity() {
    val binding: ActivityEndBinding by lazy {
        ActivityEndBinding.inflate(layoutInflater)
    }
    private var wallData = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        wallData = intent.getIntExtra("position", 0)
        clickFun()
        initWallpaper()
    }

    private fun initWallpaper() {
        binding.aivBackground.setImageResource(wallData)
    }

    private fun clickFun() {
        binding.ivSetting.setOnClickListener {
            finish()
        }
        binding.tvApply.setOnClickListener {
            binding.showDialog = true
        }
        binding.tvCancel.setOnClickListener {
            binding.showDialog = false
        }
        binding.tvDown.setOnClickListener {
            SetWallHelp.saveDrawableToGallery(this, wallData, "WallPaper", "WallPaper")
        }
        binding.tvLS.setOnClickListener {
            SetWallHelp.setWallpaperFun(this,wallData,WallpaperManager.FLAG_LOCK,{
                binding.showLoading = true
            },{
                binding.showLoading = false
                binding.showDialog = false
            })
        }
        binding.tvHS.setOnClickListener {
            SetWallHelp.setWallpaperFun(this,wallData,WallpaperManager.FLAG_SYSTEM,{
                binding.showLoading = true
            },{
                binding.showLoading = false
                binding.showDialog = false
            })
        }
        binding.tvB.setOnClickListener {
            SetWallHelp.setWallpaperBoth(this,wallData,{
                binding.showLoading = true
            },{
                binding.showLoading = false
                binding.showDialog = false
            })
        }
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            1000 -> {
                SetWallHelp.saveDrawableToGallery(this, wallData, "WallPaper", "WallPaper")
            }
        }
    }
}