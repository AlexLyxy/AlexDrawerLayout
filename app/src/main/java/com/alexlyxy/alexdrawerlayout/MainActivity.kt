package com.alexlyxy.alexdrawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import com.alexlyxy.alexdrawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            open.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
                //drawer.closeDrawer(GravityCompat.START)

            }
        }
    }
}