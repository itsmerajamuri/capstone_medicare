package com.capstone.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.medicare.entity.Admin;
import com.capstone.medicare.service.AdminServiceImpl;

@RestController
public class AdminController {

	@Autowired
	AdminServiceImpl impl;
	
	
	@PostMapping("/admin")
	public String addAdmin(@RequestBody Admin admin) {
		impl.addAdmin(admin);
		return "added successfully";
		}
	@PutMapping("/admin")
	public String updateAdmin(@RequestBody Admin admin) {
		impl.addAdmin(admin);
		return "updated successfully";
	}
	
	@GetMapping("/admin")
	public List<Admin> getAllAdmin(){
		return impl.getAll();
	}

	
	
	
	
	
	
}
