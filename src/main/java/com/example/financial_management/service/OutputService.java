package com.example.financial_management.service;

import com.example.financial_management.models.Output;
import com.example.financial_management.models.User;

import java.util.List;

public interface OutputService extends IService<Output>{
    List<Output> findByUser(User user);
    List<Output> findByUserAndMonth(User user, int month);
}
