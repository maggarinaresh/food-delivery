package com.food.delivery.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.delivery.system.entity.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

	List<Restaurant> findByRating(int rating);
	
	List<Restaurant> findByLocation(String destination);
	
	Restaurant findByName(String name);
}
