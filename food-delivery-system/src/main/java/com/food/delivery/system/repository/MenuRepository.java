package com.food.delivery.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.delivery.system.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{
	
	List<Menu> findByName(String foodName);

}
