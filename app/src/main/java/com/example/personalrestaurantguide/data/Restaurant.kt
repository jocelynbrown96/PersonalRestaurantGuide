package com.example.personalrestaurantguide.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * One saved restaurant. Stored in the Room database.
 */
@Entity(tableName = "restaurants")
data class Restaurant(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val address: String,
    val phone: String = "",
    val tags: String = "",       // comma-separated, e.g. "sushi, date night"
    val rating: Float = 0f,      // 0–5
    val notes: String = "",
    val latitude: Double = 0.0,
    val longitude: Double = 0.0
)
