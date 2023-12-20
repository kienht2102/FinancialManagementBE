package com.example.financial_management.repository;

import com.example.financial_management.models.Expense;
import com.example.financial_management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense , Integer> {
    Expense findByUser(User user);
}
