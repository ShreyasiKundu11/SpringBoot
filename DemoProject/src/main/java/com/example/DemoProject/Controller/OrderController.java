package com.example.DemoProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.DemoProject.Entity.Address;
import com.example.DemoProject.Entity.Order;
import com.example.DemoProject.Service.AddressService;
import com.example.DemoProject.Service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService ordService;
	
	@Autowired
	private AddressService adrService;
	
	@PostMapping("/")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order){
		if(order.getAddress() == null) {
			Long userId = order.getUserId();
			Address address = adrService.getAddressById(userId);
			adrService.saveAddress(address);
		}
		return new ResponseEntity<Order>(ordService.saveOrder(order), HttpStatus.CREATED);
	}
	

}
