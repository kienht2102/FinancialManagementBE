package com.example.financial_management.repository;

import com.example.financial_management.models.ExpenseCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseCategoriesRepository extends JpaRepository<ExpenseCategories, Integer> {
    List<ExpenseCategories> findAllByName(String name);
}
