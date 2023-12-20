package com.example.financial_management.service;

import com.example.financial_management.models.Input;
import com.example.financial_management.models.User;

import java.util.List;

public interface InputService extends IService<Input>{
    List<Input> findByUser(User user);
    List<Input> findByUserAndMonth(User user, int month);
}
