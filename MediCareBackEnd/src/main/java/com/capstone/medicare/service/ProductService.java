package com.capstone.medicare.service;

import java.util.List;

import com.capstone.medicare.entity.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public Product getProductById(int id);
	
	public void addProduct(Product product);
	
	public void deleteProduct(int id);

}
