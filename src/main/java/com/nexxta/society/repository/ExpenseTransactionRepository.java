package com.nexxta.society.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nexxta.society.entity.ExpenseTransactionEntity;


@Repository
public interface ExpenseTransactionRepository extends JpaRepository<ExpenseTransactionEntity, Integer> {
	
	@Query(value = "SELECT * from expense_transaction",nativeQuery = true)
	List<ExpenseTransactionEntity> getAllExpenseTransaction();

}
