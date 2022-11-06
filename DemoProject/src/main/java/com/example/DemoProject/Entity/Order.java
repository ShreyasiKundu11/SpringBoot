package com.example.DemoProject.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	private Integer orderQuantity;
	private Long userId;
	private Long productId;
	private String address;
	
	@ManyToOne
	private User user;
	
	@OneToMany
	List<Order> prodList = new ArrayList<>();
	
	

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderQuantity=" + orderQuantity + ", userId=" + userId + ", productId="
				+ productId + ", address=" + address + ", user=" + user + ", prodList=" + prodList + "]";
	}



	public Long getOrderId() {
		return orderId;
	}



	public Integer getOrderQuantity() {
		return orderQuantity;
	}



	public Long getUserId() {
		return userId;
	}



	public Long getProductId() {
		return productId;
	}



	public String getAddress() {
		return address;
	}



	public User getUser() {
		return user;
	}



	public List<Order> getProdList() {
		return prodList;
	}



	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public void setProductId(Long productId) {
		this.productId = productId;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public void setProdList(List<Order> prodList) {
		this.prodList = prodList;
	}



	public Order() {
	
	}



	public Order(Long orderId, Integer orderQuantity, Long userId, Long productId, String address, User user,
			List<Order> prodList) {
		super();
		this.orderId = orderId;
		this.orderQuantity = orderQuantity;
		this.userId = userId;
		this.productId = productId;
		this.address = address;
		this.user = user;
		this.prodList = prodList;
	}
	

	
}
