package com.food.delivery.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.system.entity.Menu;
import com.food.delivery.system.entity.Restaurant;
import com.food.delivery.system.repository.MenuRepository;
import com.food.delivery.system.repository.RestaurantRepository;
import com.food.delivery.system.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
	
	private MenuRepository menuItemRepository;
	
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	public MenuServiceImpl(MenuRepository menuItemRepository, RestaurantRepository restaurantRepository) {
		this.menuItemRepository = menuItemRepository;
		this.restaurantRepository = restaurantRepository;
	}

	@Override
	public List<Menu> getMenuByRestaurant(String restaurant) {
		 Restaurant findByName = restaurantRepository.findByName(restaurant);
		 List<Menu> menu = findByName.getMenu();
		 return menu;
	}

	@Override
	public List<Menu> getMenuByFoodName(String foodName) {
		return menuItemRepository.findByName(foodName);
	
	}

}
