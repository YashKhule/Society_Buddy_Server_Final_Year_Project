package com.nexxta.society.services;


import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexxta.society.entity.AdminActionEntity;
import com.nexxta.society.entity.AdminSessionEntity;
import com.nexxta.society.repository.AdminSessionRepository;

@Service
public class AdminSessionService {
	
	@Autowired
	private AdminSessionRepository repo;
	
	

	public AdminSessionEntity adminloginsession(AdminSessionEntity adminSessionEntity) {
		// TODO Auto-generated method stub
		
		Date currentDate = new Date();
		adminSessionEntity.setDate_in(currentDate.toString());
		adminSessionEntity.setDate_out("loggedin");
		LocalTime currenttime = java.time.LocalTime.now();
		adminSessionEntity.setTime_in(currenttime.toString());
		adminSessionEntity.setTime_out("loggedin");
		
		  return repo.save(adminSessionEntity);
		  
	}

	public AdminSessionEntity adminlogoutsession(AdminSessionEntity adminSessionEntity) {
		// TODO Auto-generated method stub
		int sessionid = adminSessionEntity.getSession_id();
		Date currentDate = new Date();
		String dateString = currentDate.toString();
		adminSessionEntity.setDate_out(currentDate.toString());
		LocalTime currenttime = java.time.LocalTime.now();
		String timeString = currenttime.toString();
		adminSessionEntity.setTime_out(currenttime.toString());
		//return repo.endsession(dateString,timeString,sessionid);
		return repo.save(adminSessionEntity);
	}
	

}
