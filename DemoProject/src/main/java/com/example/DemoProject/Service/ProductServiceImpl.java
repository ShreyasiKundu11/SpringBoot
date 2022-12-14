package com.example.DemoProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoProject.Entity.Product;
import com.example.DemoProject.Exception.ResourceNotFoundException;
import com.example.DemoProject.Repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo prodRepo;

	@Override
	public Product createProduct(Product prod) {	
		return prodRepo.save(prod);
	}

	@Override
	public List<Product> getAllProducts() {
		return prodRepo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return prodRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","productId",id));
	}

	@Override
	public Product updateProduct(Product prod, Long id) {
		Product updated = prodRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","productId",id));
		updated = prodRepo.save(prod);
		return updated;
	}

	@Override
	public void deleteProduct(Long id) {
		Product prod = prodRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product","productId",id));
		prodRepo.delete(prod);
		
	}

}
