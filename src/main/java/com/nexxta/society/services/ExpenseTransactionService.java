package com.nexxta.society.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexxta.society.entity.ExpenseTransactionEntity;
import com.nexxta.society.repository.ExpenseTransactionRepository;

@Service
public class ExpenseTransactionService {
	
	@Autowired
	private ExpenseTransactionRepository repo;

	public ExpenseTransactionEntity addExpenseDetails(ExpenseTransactionEntity details) {
		// TODO Auto-generated method stub
		return repo.save(details);
	}

	public List<ExpenseTransactionEntity> getAllExpenses() {
		// TODO Auto-generated method stub
		return repo.getAllExpenseTransaction();
	}
	

}
