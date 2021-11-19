package com.example.projekcik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projekcik.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.switch1.setOnClickListener{
            if(binding.switch1.isChecked)
                binding.textView.text = "Hello Nibba"
            else
                binding.textView.text = "Hello World"
        }
    }
}