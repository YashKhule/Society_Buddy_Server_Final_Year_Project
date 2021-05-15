package com.nexxta.society.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexxta.society.entity.MaintenanceTransactionEntity;
import com.nexxta.society.repository.MaintenanceTransactionRepository;

@Service
public class MaintenanceTransactionService {
	
	@Autowired
	private MaintenanceTransactionRepository repo;

	public MaintenanceTransactionEntity addTransactionDetails(MaintenanceTransactionEntity details) {
		
		return repo.save(details);
	}

	public List<MaintenanceTransactionEntity> getAllMaintenanceTransactions() {
		// TODO Auto-generated method stub
		return repo.getAllMaintenanceTransaction();
	}

}
