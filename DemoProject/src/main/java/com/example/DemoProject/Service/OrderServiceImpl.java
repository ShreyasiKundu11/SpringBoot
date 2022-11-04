package com.example.DemoProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoProject.Entity.Order;
import com.example.DemoProject.Repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo ordRepo;
	
	@Override
	public Order saveOrder(Order order) {
		return ordRepo.save(order);
	}

//	@Override
//	public Order updateOrder(Order order, Long orderId) {
//		Order updated = ordRepo.findById(orderId).get();
//		updated = ordRepo.save(order);
//		return updated;
//	}

}
