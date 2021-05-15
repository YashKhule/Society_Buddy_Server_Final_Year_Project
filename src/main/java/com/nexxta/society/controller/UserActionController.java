package com.nexxta.society.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexxta.society.entity.UserActionEntity;
import com.nexxta.society.services.UserActionService;



@CrossOrigin
@RestController
public class UserActionController {
	
	@Autowired
	private UserActionService service;
	
	@RequestMapping(method = RequestMethod.POST,value = "/addmember")
	public UserActionEntity addmember(@RequestBody UserActionEntity userdetails) {
		return service.addmember(userdetails);
	}
	
	@RequestMapping("/getallmembers")
	public List<UserActionEntity> getallmembers(){
		return service.getallmembers();
	}
	
	

}
