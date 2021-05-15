package com.nexxta.society.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexxta.society.entity.MaintenanceTransactionEntity;
import com.nexxta.society.services.MaintenanceTransactionService;


@RestController
public class MaintenanceTransactionController {
	
	@Autowired
	private MaintenanceTransactionService service;
	
	@RequestMapping(method = RequestMethod.POST , value = "/addmaintenance")
	public MaintenanceTransactionEntity addTransaction(@RequestBody MaintenanceTransactionEntity details) {
		return service.addTransactionDetails(details);
		
	}
	
	@RequestMapping("/getalltransactions")
	public List<MaintenanceTransactionEntity> getAllTransactions(){
		return service.getAllMaintenanceTransactions();
		
	}

}
