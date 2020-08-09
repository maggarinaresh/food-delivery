package com.food.delivery.system.service;

import java.util.List;

import com.food.delivery.system.entity.Restaurant;

public interface RestaurantService {
	
	 List<Restaurant> allRestaurants();
	 
	 List<Restaurant> searchByRating(int rating);

	 List<Restaurant> searchByDestination(String destination);
}
