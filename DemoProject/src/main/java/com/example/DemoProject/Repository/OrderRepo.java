package com.example.DemoProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DemoProject.Entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{
	
}
