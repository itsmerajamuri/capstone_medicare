package com.capstone.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.medicare.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
