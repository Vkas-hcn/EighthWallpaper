package com.fast.us.eight.eighthwallpaper.view

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fast.us.eight.eighthwallpaper.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.concurrent.atomic.AtomicBoolean

class BottomAdapter(private val dataList: List<Int>, context: Context) :
    RecyclerView.Adapter<BottomAdapter.ViewHolder>() {

    private val context: Context = context
    private val coroutineScope = CoroutineScope(Dispatchers.IO)
    private val isScrolling = AtomicBoolean(false) // 用于标识是否正在滑动中

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgMain: ImageView = itemView.findViewById(R.id.img_main)
        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemClick(position)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context: Context = parent.context
        val inflater = LayoutInflater.from(context)
        val itemView: View = inflater.inflate(R.layout.item_main, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        if (!isScrolling.get()) {
            loadImage(item, holder.imgMain)
        }

        // 设置点击事件
        holder.itemView.setOnClickListener {
            val adapterPosition = holder.adapterPosition
            if (adapterPosition != RecyclerView.NO_POSITION) {
                onItemClick(adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
    private var onItemClickListener: OnItemClickListener? = null

    fun setOnItemClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }
    private fun onItemClick(position: Int) {
        onItemClickListener?.onItemClick(position)
    }
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    private fun loadImage(imageResId: Int, imageView: ImageView) {
        coroutineScope.launch {
            val drawable = loadImageAsync(imageResId)
            withContext(Dispatchers.Main) {
                imageView.setImageDrawable(drawable)
            }
        }
    }

    private suspend fun loadImageAsync(imageResId: Int): Drawable {
        return Glide.with(context)
            .load(imageResId)
            .thumbnail(0.11f)
            .placeholder(R.mipmap.ic_launcher_round)
            .error(R.mipmap.ic_launcher_round)
            .submit()
            .get()
    }
    fun setScrolling(isScrolling: Boolean) {
        this.isScrolling.set(isScrolling)
    }
}
