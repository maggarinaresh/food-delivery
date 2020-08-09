package com.food.delivery.system.service;

import java.util.List;

import com.food.delivery.system.entity.Menu;

public interface MenuService {

	List<Menu> getMenuByRestaurant(String restaurant);
	
	List<Menu> getMenuByFoodName(String foodName);
	
}
