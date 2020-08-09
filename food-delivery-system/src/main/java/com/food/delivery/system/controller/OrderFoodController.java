package com.food.delivery.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.system.entity.Order;
import com.food.delivery.system.service.OrderService;

@RestController
@RequestMapping("/restaurant/api")
public class OrderFoodController {
	OrderService orderService;

	@Autowired
	public OrderFoodController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping(value = "/place/order")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Order createOder(@RequestBody Order order) {
		return orderService.createOrder(order);
	}
}