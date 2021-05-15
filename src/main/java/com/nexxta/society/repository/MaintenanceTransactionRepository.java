package com.nexxta.society.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.nexxta.society.entity.MaintenanceTransactionEntity;

@Repository
public interface MaintenanceTransactionRepository extends JpaRepository<MaintenanceTransactionEntity, Integer> {
	
	
	@Query(value = "SELECT * from maintenance_transaction",nativeQuery = true)
	List<MaintenanceTransactionEntity> getAllMaintenanceTransaction();

}
