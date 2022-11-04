package com.example.DemoProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoProject.Entity.Address;
import com.example.DemoProject.Repository.AddressRepo;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressRepo adRepo;
	
	@Override
	public Address saveAddress(Address adr) {
		return adRepo.save(adr);
	}

	@Override
	public Address updateAddress(Address adr, Long userId) {
		Address updated = adRepo.findById(userId).get();
		updated = adRepo.save(adr);
		return updated;
	}

	@Override
	public Address getAddressById(Long userId) {
		return adRepo.findById(userId).get();
	}

}
