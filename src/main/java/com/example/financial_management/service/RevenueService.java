package com.example.financial_management.service;

import com.example.financial_management.models.Revenue;
import com.example.financial_management.models.User;

import java.util.List;

public interface RevenueService extends IService<Revenue>{
    void addMonthlyRevenue(User user);
    List<Revenue> findByUser(User user);
    public List<Revenue> getYearlyRevenues(User user);
}
