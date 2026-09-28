package com.example.personalrestaurantguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.personalrestaurantguide.databinding.ActivityRestaurantDetailBinding

/**
 * Restaurant details screen — shown after creating a restaurant or tapping one
 * on Home. Supports edit, delete, view on map, directions, and share.
 *
 * TODO: read the restaurant id from the intent extras, load it with
 * RestaurantRepository.getRestaurant(id), and bind it to the views.
 */
class RestaurantDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestaurantDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
