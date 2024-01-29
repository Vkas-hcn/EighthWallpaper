package com.fast.us.eight.eighthwallpaper.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fast.us.eight.eighthwallpaper.databinding.ActivityPolicyBinding
import com.fast.us.eight.eighthwallpaper.utils.WallDataUtils

class PrivacyActivity : AppCompatActivity() {
    val binding: ActivityPolicyBinding by lazy {
        ActivityPolicyBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.webViewPp.loadUrl(WallDataUtils.pro_url)
        binding.webViewPp.settings.javaScriptEnabled = true
        binding.webViewPp.webViewClient = object : android.webkit.WebViewClient() {
            override fun shouldOverrideUrlLoading(view: android.webkit.WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return true
            }
        }
        binding.webViewPp.webChromeClient = object : android.webkit.WebChromeClient() {
            override fun onProgressChanged(view: android.webkit.WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if (newProgress == 100) {
                    binding.progressBarWeb.visibility = android.view.View.INVISIBLE
                } else {
                    binding.progressBarWeb.visibility = android.view.View.VISIBLE
                    binding.progressBarWeb.progress = newProgress
                }
            }
        }
        binding.ivSetting.setOnClickListener {
            finish()
        }
    }
}