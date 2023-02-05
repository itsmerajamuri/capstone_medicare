package com.capstone.medicare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.medicare.entity.Product;
import com.capstone.medicare.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
	  Optional<Product> optional=	productRepository.findById(id);
	  Product product=null;
	  if(optional!=null) {
		  product= optional.get();
	  }else {
		  throw new ArithmeticException("id not found");
	  }
		return product;
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
		
	}

}
