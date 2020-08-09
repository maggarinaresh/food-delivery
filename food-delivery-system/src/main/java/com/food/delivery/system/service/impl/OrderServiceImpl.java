package com.food.delivery.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.system.entity.Order;
import com.food.delivery.system.repository.OrderRepository;
import com.food.delivery.system.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
