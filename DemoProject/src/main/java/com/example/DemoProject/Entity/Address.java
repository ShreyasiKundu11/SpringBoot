package com.example.DemoProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
	private Long userId;
	private String address;
	
	@OneToOne
	User user;
	
	@Override
	public String toString() {
		return "Address [userId=" + userId + ", address=" + address + "]";
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Long userId, String address, User user) {
		super();
		this.userId = userId;
		this.address = address;
		this.user = user;
	}
	
	
}
