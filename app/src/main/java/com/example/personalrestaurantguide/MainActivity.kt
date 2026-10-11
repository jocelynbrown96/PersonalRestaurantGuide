package com.example.personalrestaurantguide

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var screenContainer: FrameLayout
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Use the host layout with the permanent bottom navigation
        setContentView(R.layout.activity_main_host)

        screenContainer = findViewById(R.id.screenContainer)
        bottomNav = findViewById(R.id.bottomNav)

        // Show Home screen when the app starts
        showScreen(R.layout.activity_main)

        bottomNav.selectedItemId = R.id.nav_home

        // Bottom navigation
        bottomNav.setOnItemSelectedListener { item ->

            when (item.itemId) {

                R.id.nav_home -> {
                    showScreen(R.layout.activity_main)
                    true
                }

                R.id.nav_map -> {
                    showScreen(R.layout.activity_map)
                    true
                }

                R.id.nav_about -> {
                    showScreen(R.layout.activity_about)
                    true
                }

                else -> false
            }
        }
    }

    private fun showScreen(layoutId: Int) {

        screenContainer.removeAllViews()

        val view = LayoutInflater.from(this)
            .inflate(layoutId, screenContainer, false)

        screenContainer.addView(view)

        // Home screen buttons
        if (layoutId == R.layout.activity_main) {

            // Scaddabush card
            val restaurantCard = view.findViewById<CardView>(
                R.id.restaurantCard1
            )

            restaurantCard.setOnClickListener {
                startActivity(
                    Intent(this, RestaurantDetailActivity::class.java)
                )
            }

            // Add restaurant button
            val addButton = view.findViewById<FloatingActionButton>(
                R.id.fabAdd
            )

            addButton.setOnClickListener {
                startActivity(
                    Intent(this, AddRestaurantActivity::class.java)
                )
            }
        }
    }
}