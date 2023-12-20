package com.example.financial_management.service;

import com.example.financial_management.models.ExpenseCategories;

import java.util.List;

public interface ExpenseCategoriesService extends IService<ExpenseCategories>{
    List<ExpenseCategories> findAllByName(String name);
}
