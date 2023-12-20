package com.example.financial_management.service;

import com.example.financial_management.models.Expense;
import com.example.financial_management.models.User;
import com.example.financial_management.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceImpl implements ExpenseService{
    @Autowired
    ExpenseRepository expenseRepository;
    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Override
    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public Expense edit(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public void delete(int id) {
        expenseRepository.deleteById(id);
    }

    @Override
    public Expense findById(int id) {
        return expenseRepository.findById(id).get();
    }

    @Override
    public List<Expense> getAll() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense findByLoggedInUser() {
        Optional<User> user = userDetailsService.getLoggedInUser();
        return expenseRepository.findByUser(user.get());
    }
}