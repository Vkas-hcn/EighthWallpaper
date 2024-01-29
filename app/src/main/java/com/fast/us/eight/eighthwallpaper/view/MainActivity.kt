package com.fast.us.eight.eighthwallpaper.view

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.fast.us.eight.eighthwallpaper.R
import com.fast.us.eight.eighthwallpaper.databinding.ActivityMainBinding
import com.fast.us.eight.eighthwallpaper.utils.WallDataUtils

class MainActivity : AppCompatActivity() {
    val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var imageList: MutableList<Int>
    private lateinit var bannerAdapter: BannerAdapter
    private lateinit var allList: List<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initBanner()
        initMainAdapter()
        binding.tvPrivacy.setOnClickListener {
            startActivity(Intent(this, PrivacyActivity::class.java))
        }
        binding.ivSetting.setOnClickListener {
            binding.llPrivacy.visibility = View.VISIBLE
        }
        binding.llPrivacy.setOnClickListener {

        }
        binding.clMain.setOnClickListener {
            binding.llPrivacy.visibility = View.GONE
        }
    }

    private fun initBanner() {
        imageList = WallDataUtils.getBannerList().toMutableList()
        bannerAdapter = BannerAdapter(this, imageList)
        binding.viewPager.adapter = bannerAdapter
        bannerAdapter.setViewPager(binding.viewPager)
        for (i in imageList.indices) {
            val dotView = View(this)
            val dotSize = 16
            val dotMargin = 8
            val params = LinearLayout.LayoutParams(dotSize, dotSize)
            params.setMargins(dotMargin, 0, dotMargin, 0)
            dotView.layoutParams = params
            dotView.setBackgroundResource(R.drawable.unselected_dot)
            binding.dotContainer.addView(dotView)
        }
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                updateDotIndicator(position % imageList.size)
            }
        })
        bannerAdapter.setOnBannerClickListener(object : BannerAdapter.OnBannerClickListener {
            override fun onBannerClick(position: Int) {
                jumpToWallpaper(imageList[position])
            }
        })

    }

    private fun initMainAdapter() {
        allList = WallDataUtils.getAllList()
        val adapter = BottomAdapter(allList, this)
        binding.rvMain.adapter = adapter
        binding.rvMain.layoutManager = GridLayoutManager(this, 3)
        adapter.setOnItemClickListener(object : BottomAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                jumpToWallpaper(allList[position])
            }
        })
        binding.rvMain.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                when (newState) {
                    RecyclerView.SCROLL_STATE_IDLE -> {
                        // 列表停止滚动
                        adapter.setScrolling(false)
                        adapter.notifyDataSetChanged() // 恢复加载图片
                    }

                    RecyclerView.SCROLL_STATE_DRAGGING, RecyclerView.SCROLL_STATE_SETTLING -> {
                        // 列表滚动中
                        adapter.setScrolling(true)
                    }
                }
            }
        })
    }

    private fun updateDotIndicator(selectedPosition: Int) {
        for (i in 0 until binding.dotContainer.childCount) {
            val dotView = binding.dotContainer.getChildAt(i)
            dotView.setBackgroundResource(if (i == selectedPosition) R.drawable.selected_dot else R.drawable.unselected_dot)
        }
    }

    fun jumpToWallpaper(drawable: Int) {
        if (binding.llPrivacy.isVisible) {
            binding.llPrivacy.visibility = View.GONE
            return
        }
        val intent = Intent(this@MainActivity, EndActivity::class.java)
        intent.putExtra("position", drawable)
        startActivity(intent)
    }

    override fun onResume() {
        super.onResume()
        bannerAdapter.startAutoScroll()
    }

    override fun onPause() {
        super.onPause()
        bannerAdapter.stopAutoScroll()
    }
}