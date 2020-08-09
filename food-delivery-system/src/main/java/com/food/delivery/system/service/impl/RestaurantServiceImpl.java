package com.food.delivery.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.system.entity.Restaurant;
import com.food.delivery.system.repository.RestaurantRepository;
import com.food.delivery.system.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	private RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    
	@Override
	public List<Restaurant> allRestaurants() {
		return restaurantRepository.findAll();
	}

	@Override
	public List<Restaurant> searchByRating(int rating) {
		return restaurantRepository.findByRating(rating);
	}

	@Override
	public List<Restaurant> searchByDestination(String destination) {
		return restaurantRepository.findByLocation(destination);
	}

}
