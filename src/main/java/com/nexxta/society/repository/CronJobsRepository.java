package com.nexxta.society.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.nexxta.society.entity.CronJobsEntity;

@Repository
public interface CronJobsRepository extends JpaRepository<CronJobsEntity, Integer>{
	
	 /*@Transactional
	 @Modifying
	 @Query("UPDATE maintenance_audit SET rem_amount= 3000 ")
	 public void manageInterest();
	 
	 
	 @Transactional
	 @Modifying
	 @Query("UPDATE maintenance_audit SET rem_amount = 2000")
	 public void manageMaintenance();*/
	

	@Transactional
	@Modifying      
	@Query(value = "UPDATE maintenance_audit SET rem_amount = CASE rem_amount when 0 then rem_amount else rem_amount+50 end",nativeQuery = true)
	void manageInterest();
	

	@Transactional
	@Modifying      
	@Query(value = "UPDATE maintenance_audit SET rem_amount = rem_amount+2000",nativeQuery = true)
	void manageMaintenance();
	
	
	/*@Modifying
	@Query("update maintenance_audit m set m.rem_amount = m.rem_amount+2000")
	int manageMaintenance();*/
	



}
