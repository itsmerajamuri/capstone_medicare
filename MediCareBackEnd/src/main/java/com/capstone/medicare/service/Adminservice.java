package com.capstone.medicare.service;

import java.util.List;

import com.capstone.medicare.entity.Admin;

public interface Adminservice {

	public Admin addAdmin(Admin admin);
	
	public Admin updateAdminPass(Admin admin);
	
	public List<Admin> getAll();
	
}
