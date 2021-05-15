package com.nexxta.society.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maintenance_audit")
public class CronJobsEntity {
	
	@Id
	@Column(name = "audit_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int audit_name;
	
	@Column(name = "rem_amount")
	int rem_amount;
	
	@Column(name = "paid_amount")
	int paid_amount;
	
	@Column(name = "owner_name")
	String owner_name;
	
	@Column(name = "member_id")
	int member_id;

	public CronJobsEntity() {
		
	}

	public CronJobsEntity(int audit_name, int rem_amount, int paid_amount, String owner_name, int member_id) {
		
		this.audit_name = audit_name;
		this.rem_amount = rem_amount;
		this.paid_amount = paid_amount;
		this.owner_name = owner_name;
		this.member_id = member_id;
	}

	public int getAudit_name() {
		return audit_name;
	}

	public void setAudit_name(int audit_name) {
		this.audit_name = audit_name;
	}

	public int getRem_amount() {
		return rem_amount;
	}

	public void setRem_amount(int rem_amount) {
		this.rem_amount = rem_amount;
	}

	public int getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(int paid_amount) {
		this.paid_amount = paid_amount;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	
	

}
