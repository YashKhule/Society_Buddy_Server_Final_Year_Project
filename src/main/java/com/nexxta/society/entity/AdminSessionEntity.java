package com.nexxta.society.entity;



import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adminsessions")
public class AdminSessionEntity {
	
	@Id
	@Column(name = "session_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int session_id;
	
	@Column(name = "adminid")
	int adminid;
	
	@Column(name = "date_in")
	String date_in;
	
	@Column(name = "date_out")
	String date_out;
	
	@Column(name = "time_in")
	String time_in;
	
	@Column(name = "time_out")
	String time_out;

	public AdminSessionEntity() {
		
	}

	public AdminSessionEntity(int session_id, int adminid, String date_in, String date_out, String time_in,
			String time_out) {
		
		this.session_id = session_id;
		this.adminid = adminid;
		this.date_in = date_in;
		this.date_out = date_out;
		this.time_in = time_in;
		this.time_out = time_out;
	}

	public int getSession_id() {
		return session_id;
	}

	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getDate_in() {
		return date_in;
	}

	public void setDate_in(String date_in) {
		this.date_in = date_in;
	}

	public String getDate_out() {
		return date_out;
	}

	public void setDate_out(String date_out) {
		this.date_out = date_out;
	}

	public String getTime_in() {
		return time_in;
	}

	public void setTime_in(String time_in) {
		this.time_in = time_in;
	}

	public String getTime_out() {
		return time_out;
	}

	public void setTime_out(String time_out) {
		this.time_out = time_out;
	}
	
	

}
