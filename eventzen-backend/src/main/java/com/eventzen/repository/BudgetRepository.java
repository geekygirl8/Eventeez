package com.eventzen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventzen.model.Budget;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
}

