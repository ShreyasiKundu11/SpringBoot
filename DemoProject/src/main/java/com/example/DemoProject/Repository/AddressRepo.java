package com.example.DemoProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DemoProject.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long>{
	
}
