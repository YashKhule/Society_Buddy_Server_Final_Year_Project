package com.nexxta.society.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nexxta.society.entity.UserActionEntity;

@Repository
public interface UserActionRepository extends JpaRepository<UserActionEntity, Integer> {

}
