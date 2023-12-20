package com.example.financial_management.service;

import com.example.financial_management.models.Input;
import com.example.financial_management.models.User;
import com.example.financial_management.repository.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
@Service
public class InputServiceImpl implements InputService{
    @Autowired
    InputRepository inputRepository;

    @Override
    public Input save(Input input) {
        return inputRepository.save(input);
    }

    @Override
    public Input edit(Input input) {
        return inputRepository.save(input);
    }

    @Override
    public void delete(int id) {
        inputRepository.deleteById(id);
    }

    @Override
    public Input findById(int id) {
        return inputRepository.findById(id).get();
    }

    @Override
    public List<Input> getAll() {
        return inputRepository.findAll();
    }

    @Override
    public List<Input> findByUser(User user) {
        return inputRepository.findByUser(user);
    }

    @Override
    public List<Input> findByUserAndMonth(User user, int month) {
        Calendar startOfMonth = Calendar.getInstance();
        startOfMonth.set(Calendar.DAY_OF_MONTH, 1);
        startOfMonth.set(Calendar.MONTH, month - 1);
        Calendar endOfMonth = Calendar.getInstance();
        endOfMonth.set(Calendar.DAY_OF_MONTH, endOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
        endOfMonth.set(Calendar.MONTH, month - 1);
        return inputRepository.findByUserAndCreateAtBetween(user, startOfMonth.getTime(), endOfMonth.getTime());
    }
}