package com.capstone.medicare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.medicare.entity.Admin;
import com.capstone.medicare.repository.AdminRepository;

@Service
public class AdminServiceImpl implements Adminservice{
	
	@Autowired
	AdminRepository repository;

	
	public Admin addAdmin(Admin admin) {
		return repository.save(admin);
		
		
	}


	@Override
	public Admin updateAdminPass(Admin admin) {
		return repository.save(admin);
		
	}


	@Override
	public List<Admin> getAll() {
		
		return repository.findAll();
	}

	
		
	

}
