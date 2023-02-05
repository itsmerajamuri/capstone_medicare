package com.capstone.medicare.service;

import java.util.List;

import com.capstone.medicare.entity.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();

}
