package com.nexxta.society.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "members")
public class UserActionEntity {
	
	@Id
	@Column(name = "member_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int member_id;
	
	@Column(name = "member_name")
	String member_name;
	@Column(name = "member_email")
	String member_email;
	@Column(name = "member_mobile")
	String member_mobile;
	@Column(name = "member_unit_number")
	int member_unit_number;
	@Column(name = "unit_registry_date")
	Date unit_registry_date;
	@Column(name = "owernship_rank")
	int ownership_rank;
	@Column(name = "first_owner_name")
	String first_owner_name;
	@Column(name = "registered_member")
	String registered_member;
	@Column(name = "received_share_certificate")
	String received_share_certificate;
	@Column(name = "unit_occupied_by")
	String unit_occupied_by;
	@Column(name = "rented_person_name")
	String rented_person_name;
	@Column(name = "rented_person_mobile")
	String rented_person_mobile;
	@Column(name = "registry_copy_submitted")
	String registry_copy_submitted;
	@Column(name = "nominee_details_submitted")
	String nominee_details_submitted;
	@Column(name = "registered_on_7_12")
	String registered_on_7_12;
	@Column(name = "muncipal_tax_paid")
	String muncipal_tax_paid;
	@CreatedBy
	@Column(name = "created_by")
	String created_by="admin";
	@CreatedDate
	@Column(name = "created_on")
	Date created_on;
	@LastModifiedBy
	@Column(name = "updated_by")
	String updated_by="admin";
	@LastModifiedDate
	@Column(name = "updated_on")
	Date updated_on;
	@Column(name = "member_password")
	String member_password;
	
	public UserActionEntity() {
		
	}

	public UserActionEntity(int member_id, String member_name, String member_email, String member_mobile,
			int member_unit_number, Date unit_registry_date, int ownership_rank, String first_owner_name,
			String registered_member, String received_share_certificate, String unit_occupied_by,
			String rented_person_name, String rented_person_mobile, String registry_copy_submitted,
			String nominee_details_submitted, String registered_on_7_12, String muncipal_tax_paid, String created_by,
			Date created_on, String updated_by, Date updated_on,String member_password) {
		
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_email = member_email;
		this.member_mobile = member_mobile;
		this.member_unit_number = member_unit_number;
		this.unit_registry_date = unit_registry_date;
		this.ownership_rank = ownership_rank;
		this.first_owner_name = first_owner_name;
		this.registered_member = registered_member;
		this.received_share_certificate = received_share_certificate;
		this.unit_occupied_by = unit_occupied_by;
		this.rented_person_name = rented_person_name;
		this.rented_person_mobile = rented_person_mobile;
		this.registry_copy_submitted = registry_copy_submitted;
		this.nominee_details_submitted = nominee_details_submitted;
		this.registered_on_7_12 = registered_on_7_12;
		this.muncipal_tax_paid = muncipal_tax_paid;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
		this.member_password = member_password;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_mobile() {
		return member_mobile;
	}

	public void setMember_mobile(String member_mobile) {
		this.member_mobile = member_mobile;
	}

	public int getMember_unit_number() {
		return member_unit_number;
	}

	public void setMember_unit_number(int member_unit_number) {
		this.member_unit_number = member_unit_number;
	}

	public Date getUnit_registry_date() {
		return unit_registry_date;
	}

	public void setUnit_registry_date(Date unit_registry_date) {
		this.unit_registry_date = unit_registry_date;
	}

	public int getOwnership_rank() {
		return ownership_rank;
	}

	public void setOwnership_rank(int ownership_rank) {
		this.ownership_rank = ownership_rank;
	}

	public String getFirst_owner_name() {
		return first_owner_name;
	}

	public void setFirst_owner_name(String first_owner_name) {
		this.first_owner_name = first_owner_name;
	}

	public String getRegistered_member() {
		return registered_member;
	}

	public void setRegistered_member(String registered_member) {
		this.registered_member = registered_member;
	}

	public String getReceived_share_certificate() {
		return received_share_certificate;
	}

	public void setReceived_share_certificate(String received_share_certificate) {
		this.received_share_certificate = received_share_certificate;
	}

	public String getUnit_occupied_by() {
		return unit_occupied_by;
	}

	public void setUnit_occupied_by(String unit_occupied_by) {
		this.unit_occupied_by = unit_occupied_by;
	}

	public String getRented_person_name() {
		return rented_person_name;
	}

	public void setRented_person_name(String rented_person_name) {
		this.rented_person_name = rented_person_name;
	}

	public String getRented_person_mobile() {
		return rented_person_mobile;
	}

	public void setRented_person_mobile(String rented_person_mobile) {
		this.rented_person_mobile = rented_person_mobile;
	}

	public String getRegistry_copy_submitted() {
		return registry_copy_submitted;
	}

	public void setRegistry_copy_submitted(String registry_copy_submitted) {
		this.registry_copy_submitted = registry_copy_submitted;
	}

	public String getNominee_details_submitted() {
		return nominee_details_submitted;
	}

	public void setNominee_details_submitted(String nominee_details_submitted) {
		this.nominee_details_submitted = nominee_details_submitted;
	}

	public String getRegistered_on_7_12() {
		return registered_on_7_12;
	}

	public void setRegistered_on_7_12(String registered_on_7_12) {
		this.registered_on_7_12 = registered_on_7_12;
	}

	public String getMuncipal_tax_paid() {
		return muncipal_tax_paid;
	}

	public void setMuncipal_tax_paid(String muncipal_tax_paid) {
		this.muncipal_tax_paid = muncipal_tax_paid;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}
	
	

}
