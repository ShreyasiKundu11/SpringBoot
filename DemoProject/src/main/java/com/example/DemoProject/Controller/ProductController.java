package com.example.DemoProject.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.DemoProject.Entity.Product;
import com.example.DemoProject.Service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity<List<Product>>(prodService.getAllProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id){
		return new ResponseEntity<Product>(prodService.getProductById(id), HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Product> saveUser(@RequestBody Product prod){
		return new ResponseEntity<Product>(prodService.createProduct(prod), HttpStatus.CREATED);
	}
	
	@PutMapping("/{productId}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product prod, @PathVariable Long id){
		return new ResponseEntity<Product>(prodService.updateProduct(prod,id), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteProduct(@PathVariable Long id){
		prodService.deleteProduct(id);
		return new ResponseEntity<Object>(Map.of("message","Product Deleted Succesfully"),HttpStatus.OK);
	}

}
