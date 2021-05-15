package com.nexxta.society.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexxta.society.entity.AdminActionEntity;
import com.nexxta.society.entity.AdminSessionEntity;
import com.nexxta.society.services.AdminSessionService;

@RestController
public class AdminSessionController {
	
	@Autowired
	private AdminSessionService service;
	
	@RequestMapping(method = RequestMethod.POST , value = "/startsession")
	public AdminSessionEntity adminloginsession(@RequestBody AdminSessionEntity adminSessionEntity) {
		return service.adminloginsession(adminSessionEntity);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/endsession")
	public AdminSessionEntity adminlogoutsession(@RequestBody AdminSessionEntity adminSessionEntity) {
		 return service.adminlogoutsession(adminSessionEntity);
	}

}
