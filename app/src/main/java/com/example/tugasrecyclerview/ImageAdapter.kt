package com.example.tugasrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasrecyclerview.databinding.ItemImageBinding

class ImageAdapter (private val listImages: List<ImageItem>,
                    private val onClickImage: (ImageItem) -> Unit
) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    inner class ImageViewHolder(private val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(imageItem: ImageItem) {
            binding.imageView.setImageResource(imageItem.imageResId)

            binding.root.setOnClickListener {
                onClickImage(imageItem)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(listImages[position])
    }

    override fun getItemCount(): Int = listImages.size
}