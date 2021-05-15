package com.nexxta.society.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense_transaction")
public class ExpenseTransactionEntity {
	
	@Id
	@Column(name = "expense_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int expense_id;
	
	@Column(name = "dealer_name")
	String dealer_name;
	
	@Column(name = "amount")
	int amount;
	
	@Column(name = "payment_type")
	String payment_type;
	
	@Column(name = "payment_date")
	Date payment_date;
	
	@Column(name = "payment_reason")
	String payment_reason;

	public ExpenseTransactionEntity() {
		
	}

	public ExpenseTransactionEntity(int expense_id, String dealer_name, int amount, String payment_type,
			Date payment_date, String payment_reason) {
		
		this.expense_id = expense_id;
		this.dealer_name = dealer_name;
		this.amount = amount;
		this.payment_type = payment_type;
		this.payment_date = payment_date;
		this.payment_reason = payment_reason;
	}

	public int getExpense_id() {
		return expense_id;
	}

	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}

	public String getDealer_name() {
		return dealer_name;
	}

	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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

	public String getPayment_reason() {
		return payment_reason;
	}

	public void setPayment_reason(String payment_reason) {
		this.payment_reason = payment_reason;
	}
	
	

}
