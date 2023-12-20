package com.example.financial_management.service;

import com.example.financial_management.models.ExpenseCategories;
import com.example.financial_management.repository.ExpenseCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseCategoriesServiceImpl implements ExpenseCategoriesService{
    @Autowired
    ExpenseCategoriesRepository expenseCategoriesRepository;


    @Override
    public List<ExpenseCategories> findAllByName(String name) {
        return expenseCategoriesRepository.findAllByName(name);
    }

    @Override
    public ExpenseCategories save(ExpenseCategories expenseCategories) {
        return expenseCategoriesRepository.save(expenseCategories);
    }

    @Override
    public ExpenseCategories edit(ExpenseCategories expenseCategories) {
        return expenseCategoriesRepository.save(expenseCategories);
    }

    @Override
    public void delete(int id) {
         expenseCategoriesRepository.deleteById(id);
    }

    @Override
    public ExpenseCategories findById(int id) {
        return expenseCategoriesRepository.findById(id).get();
    }

    @Override
    public List<ExpenseCategories> getAll() {
        return expenseCategoriesRepository.findAll();
    }
}