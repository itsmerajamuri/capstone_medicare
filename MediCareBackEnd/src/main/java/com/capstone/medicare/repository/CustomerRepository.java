package com.capstone.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.medicare.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	

}
