package com.example.DemoProject.Service;

import org.springframework.stereotype.Service;

import com.example.DemoProject.Entity.Order;

@Service
public interface OrderService {
	//create
	Order saveOrder(Order order);
	
	//update
//	Order updateOrder(Order order, Long orderId);
}
