package com.nexxta.society.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexxta.society.controller.AdminSessionController;
import com.nexxta.society.entity.AdminActionEntity;
import com.nexxta.society.repository.AdminActionRepository;

@Service
public class AdminActionService {
	
	@Autowired
	private AdminActionRepository repo;
	
	

	public List<AdminActionEntity> adminlogin(AdminActionEntity admindetailslogin) {
		// TODO Auto-generated method stub
		return repo.findByUsername(admindetailslogin.getUsername());
		
	}

	public void adminlogout(AdminActionEntity admindetailslogout) {
		// TODO Auto-generated method stub
		
	}

}
