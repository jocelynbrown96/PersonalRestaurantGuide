package com.example.personalrestaurantguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.personalrestaurantguide.databinding.ActivityMainBinding

/**
 * Home screen — the user's saved restaurants.
 *
 * TODO (UI/UX): wire up the RecyclerView with a RestaurantAdapter,
 * connect the SearchView to filter via RestaurantRepository.searchRestaurants(),
 * and load data with a lifecycleScope coroutine.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_map -> {
                    startActivity(Intent(this, MapActivity::class.java))
                    true
                }
                R.id.nav_about -> {
                    startActivity(Intent(this, AboutActivity::class.java))
                    true
                }
                else -> true // nav_home — already here
            }
        }

        binding.fabAdd.setOnClickListener {
            startActivity(Intent(this, AddRestaurantActivity::class.java))
        }
    }
}
