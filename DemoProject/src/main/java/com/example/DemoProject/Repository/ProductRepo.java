package com.example.DemoProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DemoProject.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
