package com.example.DemoProject.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.DemoProject.Entity.Product;

@Service
public interface ProductService {
	//create
	Product createProduct(Product prod);
	
	//read
	List<Product> getAllProducts();
	Product getProductById(Long id);
	
	//update
	Product updateProduct(Product prod, Long id);
	
	//delete
	void deleteProduct(Long id);

}
