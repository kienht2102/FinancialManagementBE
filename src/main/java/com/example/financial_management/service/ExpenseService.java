package com.example.financial_management.service;

import com.example.financial_management.models.Expense;
import com.example.financial_management.models.User;

public interface ExpenseService extends IService<Expense>{
    Expense findByLoggedInUser();
}
