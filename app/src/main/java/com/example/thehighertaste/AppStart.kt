package com.example.thehighertaste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thehighertaste.databinding.ActivityAppStartBinding

class AppStart : AppCompatActivity() {

    private val binding: ActivityAppStartBinding by lazy {
        ActivityAppStartBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.nextbutton.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}