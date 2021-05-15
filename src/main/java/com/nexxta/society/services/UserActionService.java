package com.nexxta.society.services;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexxta.society.entity.UserActionEntity;
import com.nexxta.society.repository.UserActionRepository;



@Service
public class UserActionService {
	
	@Autowired
	private UserActionRepository repo;

	public UserActionEntity addmember(UserActionEntity userdetails) {
		// TODO Auto-generated method stub
		if(userdetails.getFirst_owner_name()==null && userdetails.getOwnership_rank()==1) {
			userdetails.setFirst_owner_name("not set");
		}
		if(userdetails.getRented_person_name()==null  ) {
			userdetails.setRented_person_name("no");
			userdetails.setRented_person_mobile("no");
		}
		userdetails.setCreated_by("admin");
		userdetails.setUpdated_by("admin");
		Date currentDate = new Date();
		userdetails.setCreated_on(currentDate);
		userdetails.setUpdated_on(currentDate);
		userdetails.setMember_password(userdetails.getMember_mobile());
		return repo.save(userdetails);
	}

	public java.util.List<UserActionEntity> getallmembers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	

}
