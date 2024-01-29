package com.fast.us.eight.eighthwallpaper.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.ProgressBar
import com.fast.us.eight.eighthwallpaper.R
import com.fast.us.eight.eighthwallpaper.databinding.ActivityFirstBinding
import com.fast.us.eight.eighthwallpaper.databinding.ActivityMainBinding

class FirstActivity : AppCompatActivity() {
    val binding: ActivityFirstBinding by lazy {
        ActivityFirstBinding.inflate(layoutInflater)
    }
    private lateinit var timer: CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initTimer()
    }

    private fun initTimer() {
        timer = object : CountDownTimer(3000, 100) {
            override fun onTick(millisUntilFinished: Long) {
                val progress = ((3000 - millisUntilFinished) * 100 / 3000).toInt()
                binding.progressBarFirst.progress = progress
            }

            override fun onFinish() {
                val intent = Intent(this@FirstActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.cancel()
    }
}