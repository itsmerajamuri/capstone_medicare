package com.capstone.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.medicare.entity.Product;
import com.capstone.medicare.service.ProductServiceImpl;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductServiceImpl impl;
	
	@GetMapping("/")
	public List<Product> getAllProducts(){
		return impl.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable(value="id") int id) {
		return impl.getProductById(id);
	}
	
	@PostMapping("/")
	public String addProduct(@RequestBody Product product) {
		impl.addProduct(product);
		return "added succsessfully ";
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable(value="id") int id) {
		impl.deleteProduct(id);
		return "deleted Successfully";
		
	}

}
