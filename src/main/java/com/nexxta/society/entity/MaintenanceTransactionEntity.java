package com.nexxta.society.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maintenance_transaction")
public class MaintenanceTransactionEntity {
	
	@Id
	@Column(name = "maintenance_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int maintenance_id;
	
	@Column(name = "owner_name")
	String owner_name;
	
	@Column(name = "house_no")
	int house_no;
	
	@Column(name = "payment_type")
	String payment_type;
	
	@Column(name = "payment_date")
	Date payment_date;
	
	@Column(name = "payment_for_month")
	String payment_for_month;

	public MaintenanceTransactionEntity() {
		
	}

	public MaintenanceTransactionEntity(int maintenance_id, String owner_name, int house_no, String payment_type,
			Date payment_date, String payment_for_month) {
		
		this.maintenance_id = maintenance_id;
		this.owner_name = owner_name;
		this.house_no = house_no;
		this.payment_type = payment_type;
		this.payment_date = payment_date;
		this.payment_for_month = payment_for_month;
	}

	public int getMaintenance_id() {
		return maintenance_id;
	}

	public void setMaintenance_id(int maintenance_id) {
		this.maintenance_id = maintenance_id;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public int getHouse_no() {
		return house_no;
	}

	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public String getPayment_for_month() {
		return payment_for_month;
	}

	public void setPayment_for_month(String payment_for_month) {
		this.payment_for_month = payment_for_month;
	}
	
	
	

}
