package com.nexxta.society.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.nexxta.society.services.CronJobsService;


@EnableScheduling
@Controller
public class CronJobsController {
	
	@Autowired
	private CronJobsService service;
	
	@Scheduled(cron = "0 55 23 L * ?")
	public void manageInterest() {
		System.out.println("running cron job for managing interest");
		service.manageInterest();
	}
	
	@Scheduled(cron = "0 59 23 L * ?")
	public void manageMaintenance() {
		System.out.println("running cron for managing monthly maintenance");
		service.manageMaintenance();
	}
	
	
}
