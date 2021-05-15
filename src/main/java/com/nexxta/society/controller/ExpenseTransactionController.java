package com.nexxta.society.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexxta.society.entity.ExpenseTransactionEntity;
import com.nexxta.society.services.ExpenseTransactionService;

@RestController
public class ExpenseTransactionController {
	
	@Autowired
	private ExpenseTransactionService service;
	
	@RequestMapping(method = RequestMethod.POST , value = "/addexpense")
	public ExpenseTransactionEntity addExpense(@RequestBody ExpenseTransactionEntity details) {
		return service.addExpenseDetails(details);
		
	}
	
	@RequestMapping("/getallexpenses")
	public List<ExpenseTransactionEntity> getExpenses(){
		return service.getAllExpenses();
		
	}

}
