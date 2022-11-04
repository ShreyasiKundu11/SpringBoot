package com.example.DemoProject.Service;

import org.springframework.stereotype.Service;

import com.example.DemoProject.Entity.Address;

@Service
public interface AddressService {
	//create
	Address saveAddress(Address adr); 
	
	//read
	Address getAddressById(Long userId);
	
	//update
	Address updateAddress(Address adr, Long userId);
}
