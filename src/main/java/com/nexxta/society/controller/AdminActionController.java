package com.nexxta.society.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexxta.society.entity.AdminActionEntity;
import com.nexxta.society.services.AdminActionService;

@RestController
public class AdminActionController {
	
	@Autowired
	private AdminActionService service;
	
	@RequestMapping(method = RequestMethod.POST,value = "/adminlogin")
	public List<AdminActionEntity> adminlogin(@RequestBody AdminActionEntity admindetailslogin) {
		
		return service.adminlogin(admindetailslogin);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/adminlogout")
	public void adminlogout(@RequestBody AdminActionEntity admindetailslogout) {
		
		service.adminlogout(admindetailslogout);
		
	}

}
