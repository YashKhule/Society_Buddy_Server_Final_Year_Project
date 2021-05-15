package com.nexxta.society.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexxta.society.repository.CronJobsRepository;

@Service
public class CronJobsService {
	
	@Autowired
	private CronJobsRepository repo;

	public void manageInterest() {
		// TODO Auto-generated method stub
		repo.manageInterest();
		
		
		
	}

	public void manageMaintenance() {
		// TODO Auto-generated method stub
		repo.manageMaintenance();
		
	}

}
