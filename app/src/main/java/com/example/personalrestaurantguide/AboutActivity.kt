package com.example.personalrestaurantguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.personalrestaurantguide.databinding.ActivityAboutBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * About screen — creator and project information.
 *
 * TODO (UI/UX): fill in names, course, and a short blurb about the project.
 */
class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigation =
            findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }

                R.id.nav_map -> {
                    startActivity(Intent(this, MapActivity::class.java))
                    true
                }

                R.id.nav_about -> {
                    true
                }

                else -> true
            }
        }
    }
}