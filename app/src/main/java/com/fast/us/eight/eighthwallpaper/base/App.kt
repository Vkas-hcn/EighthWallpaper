package com.fast.us.eight.eighthwallpaper.base

import android.app.Application
import android.content.Context
import android.util.Log
import com.fast.us.eight.eighthwallpaper.utils.SetWallHelp
import com.fast.us.eight.eighthwallpaper.utils.WallDataUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.UUID

class App: Application() {
    companion object {
        private lateinit var appContext: Context
        fun getAppContext(): Context {
            return appContext
        }
    }
    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        WallDataUtils.eighth_id.let {
            if (it.isEmpty()) {
                WallDataUtils.eighth_id = UUID.randomUUID().toString()
            }
        }
        WallDataUtils.black_url.getBlackList(this)
    }
    private fun String.getBlackList(context: Context) {
        if (WallDataUtils.eighth_black_key.isNotEmpty()) {
            return
        }
        GlobalScope.launch(Dispatchers.IO) {
            SetWallHelp.getBlackNameNet(this@getBlackList,WallDataUtils.cloakJson(context), onNext = {
                Log.e("TAG", "The blacklist request is successful：$it")
                WallDataUtils.eighth_black_key = it
            }, onError = {
                retry(it,context)
            })
        }
    }

    private fun retry(it: String,context: Context) {
        GlobalScope.launch(Dispatchers.IO) {
            delay(10002)
            Log.e("TAG", "The blacklist request failed：$it")
            WallDataUtils.black_url.getBlackList(context)
        }
    }
}