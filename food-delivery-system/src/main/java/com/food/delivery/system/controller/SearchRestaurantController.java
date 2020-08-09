package com.food.delivery.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.system.entity.Restaurant;
import com.food.delivery.system.service.RestaurantService;

@RestController
@RequestMapping("/restaurant/api")
public class SearchRestaurantController {
	
	RestaurantService restaurantService;

	@Autowired
	public SearchRestaurantController(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	
	@GetMapping(value="/restaurants")
	public List<Restaurant> getAllRestaurants(){
		return restaurantService.allRestaurants();
	}
	
	@GetMapping(value="/restaurant/byRating/{rating}")
	public List<Restaurant> searchRestaurantByRating(@PathVariable int rating) {
		return restaurantService.searchByRating(rating);		
	}
	
	@GetMapping(value="/restaurant/byDestination/{destination}")
	public List<Restaurant> searchRestaurantByRating(@PathVariable String destination) {
		return restaurantService.searchByDestination(destination);		
	}
	
}