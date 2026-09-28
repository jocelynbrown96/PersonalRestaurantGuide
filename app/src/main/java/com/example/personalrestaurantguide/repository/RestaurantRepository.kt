package com.example.personalrestaurantguide.repository

import com.example.personalrestaurantguide.data.Restaurant
import com.example.personalrestaurantguide.data.RestaurantDao

/**
 * Single access point for restaurant data.
 * The UI talks to this — never to the DAO directly.
 */
class RestaurantRepository(private val dao: RestaurantDao) {

    suspend fun getAllRestaurants(): List<Restaurant> = dao.getAll()

    suspend fun searchRestaurants(query: String): List<Restaurant> = dao.search(query)

    suspend fun getRestaurant(id: Long): Restaurant? = dao.getById(id)

    suspend fun addRestaurant(restaurant: Restaurant): Long = dao.insert(restaurant)

    suspend fun updateRestaurant(restaurant: Restaurant) = dao.update(restaurant)

    suspend fun deleteRestaurant(restaurant: Restaurant) = dao.delete(restaurant)
}
