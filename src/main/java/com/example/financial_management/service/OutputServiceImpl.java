package com.example.financial_management.service;

import com.example.financial_management.models.Output;
import com.example.financial_management.models.User;
import com.example.financial_management.repository.OutputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class OutputServiceImpl implements OutputService{
    @Autowired
    OutputRepository outputRepository;

    @Override
    public Output save(Output output) {
        return outputRepository.save(output);
    }

    @Override
    public Output edit(Output output) {
        return outputRepository.save(output);
    }

    @Override
    public void delete(int id) {
      outputRepository.deleteById(id);
    }

    @Override
    public Output findById(int id) {
        return outputRepository.findById(id).get();
    }

    @Override
    public List<Output> getAll() {
        return outputRepository.findAll();
    }

    @Override
    public List<Output> findByUser(User user) {
        return outputRepository.findByUser(user);
    }

    @Override
    public List<Output> findByUserAndMonth(User user, int month) {
        Calendar startOfMonth = Calendar.getInstance();
        startOfMonth.set(Calendar.DAY_OF_MONTH, 1);
        startOfMonth.set(Calendar.MONTH, month - 1);
        Calendar endOfMonth = Calendar.getInstance();
        endOfMonth.set(Calendar.DAY_OF_MONTH, endOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
        endOfMonth.set(Calendar.MONTH, month - 1);
        return outputRepository.findByUserAndCreateAtBetween(user, startOfMonth.getTime(), endOfMonth.getTime());
    }
}