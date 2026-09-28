package com.example.personalrestaurantguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.personalrestaurantguide.databinding.ActivityAddRestaurantBinding

/**
 * Add a Restaurant screen — form for name, address, phone, tags, rating.
 *
 * TODO: read the form fields, build a Restaurant, and save it with
 * RestaurantRepository.addRestaurant() inside a lifecycleScope coroutine.
 */
class AddRestaurantActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddRestaurantBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddRestaurantBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
