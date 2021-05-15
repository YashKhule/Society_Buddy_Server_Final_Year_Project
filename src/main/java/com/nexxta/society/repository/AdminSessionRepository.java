package com.nexxta.society.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nexxta.society.entity.AdminActionEntity;
import com.nexxta.society.entity.AdminSessionEntity;

@Repository
public interface AdminSessionRepository extends JpaRepository<AdminSessionEntity, Integer> {
	
	@Transactional
	@Modifying      
	@Query(value = "Update adminsessions set date_out=?,time_out=? where session_id=?",nativeQuery = true)
	List<AdminActionEntity> endsession(String date,String time,int id);

}
