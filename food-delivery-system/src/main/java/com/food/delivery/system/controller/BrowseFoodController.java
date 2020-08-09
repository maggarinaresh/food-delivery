package com.food.delivery.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.system.entity.Menu;
import com.food.delivery.system.service.MenuService;

@RestController
@RequestMapping("/restaurant/api")
public class BrowseFoodController {
	
	MenuService menuService;

	@Autowired
	public BrowseFoodController(MenuService menuService) {
		this.menuService = menuService;
	}
	
	@GetMapping(value="/getMenu/{restaurant}")
	public List<Menu> getMenu(@PathVariable String restaurant){
		return menuService.getMenuByRestaurant(restaurant);
	}
	
	@GetMapping(value="/getMenu/food/{foodItemName}")
	public List<Menu> getMenuByFoodName(@PathVariable String foodItemName){
		return menuService.getMenuByFoodName(foodItemName);
	}

}
