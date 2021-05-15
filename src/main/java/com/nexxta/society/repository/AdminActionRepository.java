package com.nexxta.society.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nexxta.society.entity.AdminActionEntity;

@Repository
public interface AdminActionRepository extends JpaRepository<AdminActionEntity, Integer> {
	
	@Query(value = "SELECT * from adminlogin where username=?",nativeQuery = true)
	List<AdminActionEntity> findByUsername(String username);

}
