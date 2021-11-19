package com.example.projekcik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.projekcik.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(binding.switch1.isChecked) {
                binding.textView.text = "Hello Nibba"
                binding.imageView.setImageResource(R.drawable.grek)
                Handler(Looper.getMainLooper()).postDelayed({
                    binding.switch1.isChecked = false;
                }, 1000)
            }
            else {
                binding.textView.text = "Hello World"
                binding.imageView.setImageResource(R.drawable.shy)
            }
        }
    }
}