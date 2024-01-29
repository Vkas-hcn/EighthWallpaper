package com.fast.us.eight.eighthwallpaper.view


import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.fast.us.eight.eighthwallpaper.databinding.ItemViewPagerBinding

class BannerAdapter(private val context: Context, private val data: List<Int>) :
    RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {

    private var viewPager: ViewPager2? = null
    private val autoScrollHandler = Handler(Looper.getMainLooper())
    private var currentItem = 0
    private var isAutoScrolling = false
    private var isScrolling = false

    init {
        currentItem = Int.MAX_VALUE / 2 - Int.MAX_VALUE / 2 % data.size
        startAutoScroll()
    }

    inner class BannerViewHolder(binding: ItemViewPagerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val bannerImage = binding.bannerImage
        init {
            bannerImage.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onBannerClickListener?.onBannerClick(position % data.size)
                }
            }
        }
    }
    private var onBannerClickListener: OnBannerClickListener? = null

    fun setOnBannerClickListener(listener: OnBannerClickListener) {
        onBannerClickListener = listener
    }
    interface OnBannerClickListener {
        fun onBannerClick(position: Int)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val binding = ItemViewPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BannerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        val realPosition = position % data.size
        val imageResId = data[realPosition]
        holder.bannerImage.setImageResource(imageResId)

        for (i in data.indices) {
            val dotView = View(context)
            val dotSize = if (i == realPosition) 16 else 8
            val params = ViewGroup.LayoutParams(dotSize, dotSize)
            dotView.layoutParams = params
        }
    }

    override fun getItemCount(): Int {
        return Int.MAX_VALUE
    }

    fun setViewPager(viewPager: ViewPager2) {
        this.viewPager = viewPager
    }

    fun startAutoScroll() {
        if (!isAutoScrolling) {
            val autoScrollRunnable = object : Runnable {
                override fun run() {
                    viewPager?.setCurrentItem(currentItem++, true)
                    autoScrollHandler.postDelayed(this, 3000)
                }
            }
            autoScrollHandler.postDelayed(autoScrollRunnable, 500)
            isAutoScrolling = true
        }
    }
    fun stopAutoScroll() {
        autoScrollHandler.removeCallbacksAndMessages(null)
        isAutoScrolling = false
    }
}

