package com.food.delivery.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.delivery.system.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
