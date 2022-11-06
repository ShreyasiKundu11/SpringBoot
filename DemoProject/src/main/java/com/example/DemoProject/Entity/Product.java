package com.example.DemoProject.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	private String productName;
	private String category;
	private Long Quantity;
	private Double price;
	
	@ManyToOne
	private Order order;
	
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", Quantity=" + Quantity + ", price=" + price + "]";
	}



	public Long getProductId() {
		return productId;
	}



	public void setProductId(Long productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public Long getQuantity() {
		return Quantity;
	}



	public void setQuantity(Long quantity) {
		Quantity = quantity;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Order getOrder() {
		return order;
	}



	public void setOrder(Order order) {
		this.order = order;
	}



	public Product() {
		
	}



	public Product(Long productId, String productName, String category, Long quantity, Double price, Order order) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		Quantity = quantity;
		this.price = price;
		this.order = order;
	}
	
	
}
