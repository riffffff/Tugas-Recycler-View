package com.example.tugasrecyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tugasrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageAdapter = ImageAdapter(generateDataDummy()) { imageItem ->
            Toast.makeText(this, "Clicked: ${imageItem.imageResId}", Toast.LENGTH_SHORT).show()
        }

        binding.rvImages.layoutManager = GridLayoutManager(this, 3)
        binding.rvImages.adapter = imageAdapter
    }

    private fun generateDataDummy(): List<ImageItem> {
        return listOf(
            ImageItem(R.drawable.messi),
            ImageItem(R.drawable.bale),
            ImageItem(R.drawable.ronaldo),
            ImageItem(R.drawable.neymar),
            ImageItem(R.drawable.messi),
            ImageItem(R.drawable.bale),
            ImageItem(R.drawable.ronaldo),
            ImageItem(R.drawable.neymar)
        )
    }
}