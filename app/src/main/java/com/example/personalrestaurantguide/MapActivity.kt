package com.example.personalrestaurantguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.personalrestaurantguide.databinding.ActivityMapBinding

/**
 * Map screen — pins for every saved restaurant.
 *
 * TODO: add a SupportMapFragment to the layout, implement OnMapReadyCallback,
 * load all restaurants from the repository, and drop a marker per restaurant.
 * Tapping a marker shows a small info popup with a link to the details screen.
 * Requires a valid MAPS_API_KEY in local.properties.
 */
class MapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
