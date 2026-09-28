package com.example.personalrestaurantguide.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

/**
 * All database queries for restaurants. Called from RestaurantRepository —
 * never directly from the UI.
 */
@Dao
interface RestaurantDao {

    @Query("SELECT * FROM restaurants ORDER BY name ASC")
    suspend fun getAll(): List<Restaurant>

    @Query("SELECT * FROM restaurants WHERE id = :id")
    suspend fun getById(id: Long): Restaurant?

    @Query(
        """SELECT * FROM restaurants
           WHERE name LIKE '%' || :query || '%'
              OR tags LIKE '%' || :query || '%'"""
    )
    suspend fun search(query: String): List<Restaurant>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(restaurant: Restaurant): Long

    @Update
    suspend fun update(restaurant: Restaurant)

    @Delete
    suspend fun delete(restaurant: Restaurant)
}
