package com.example.DemoProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.DemoProject.Entity.Address;
import com.example.DemoProject.Service.AddressService;

@Controller
@RequestMapping("/addesses")
public class AddressController {
	
	@Autowired
	AddressService adrService;
	
	@PostMapping("/")
	public ResponseEntity<Address> saveAddress(@RequestBody Address adr){
		return new ResponseEntity<>(adrService.saveAddress(adr), HttpStatus.CREATED);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<Address> UpdateAddress(@RequestBody Address adr, @PathVariable Long userId){
		return new ResponseEntity<>(adrService.updateAddress(adr,userId), HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Address> getAddressById(@PathVariable Long userId){
		return new ResponseEntity<Address>(adrService.getAddressById(userId), HttpStatus.OK);
	}
}
