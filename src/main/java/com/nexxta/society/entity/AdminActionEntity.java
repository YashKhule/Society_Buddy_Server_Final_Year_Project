package com.nexxta.society.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adminlogin")
public class AdminActionEntity {
	
	@Id
	@Column(name = "adminid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int adminid;
	
	@Column(name = "username")
	String username;
	
	@Column(name = "password")
	String password;

	public AdminActionEntity() {
		
	}

	public AdminActionEntity(int adminid, String username, String password) {
		
		this.adminid = adminid;
		this.username = username;
		this.password = password;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
