package com.example.financial_management.service;

import com.example.financial_management.models.Revenue;
import com.example.financial_management.models.User;
import com.example.financial_management.repository.InputRepository;
import com.example.financial_management.repository.RevenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class RevenueServiceImpl implements RevenueService{
    @Autowired
    RevenueRepository revenueRepository;

    @Autowired
    InputRepository inputRepository;

    @Override
    public Revenue save(Revenue revenue) {
        return revenueRepository.save(revenue);
    }

    @Override
    public Revenue edit(Revenue revenue) {
        return revenueRepository.save(revenue);
    }

    @Override
    public void delete(int id) {
       revenueRepository.deleteById(id);
    }

    @Override
    public Revenue findById(int id) {
        return revenueRepository.findById(id).get();
    }

    @Override
    public List<Revenue> getAll() {
        return revenueRepository.findAll();
    }

    @Override
    public void addMonthlyRevenue(User user) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date firstDayOfMonth = calendar.getTime();
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        Date lastDayOfMonth = calendar.getTime();
        boolean isRevenueExists = revenueRepository.existsByUserAndMonthBetween(user, firstDayOfMonth, lastDayOfMonth);
        if (!isRevenueExists) {
            long monthlySalary = inputRepository.findMonthlySalary(user.getId(), firstDayOfMonth, lastDayOfMonth);
                    Revenue  revenue= new Revenue(monthlySalary, firstDayOfMonth, user);
            revenueRepository.save(revenue);
        } else {
            Revenue existingRevenue = revenueRepository.findByUserAndMonthBetween(user, firstDayOfMonth, lastDayOfMonth);
            long monthlySalary = inputRepository.findMonthlySalary(user.getId(), firstDayOfMonth, lastDayOfMonth);
            existingRevenue.setRevenue(existingRevenue.getRevenue() + monthlySalary);
            revenueRepository.save(existingRevenue);
        }
    }
    @Override
    public List<Revenue> getYearlyRevenues(User user) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date firstDayOfYear = calendar.getTime();
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        Date lastDayOfYear = calendar.getTime();
        return revenueRepository.findAllByUserAndMonthBetween(user, firstDayOfYear, lastDayOfYear);
    }
    @Override
    public List<Revenue> findByUser(User user) {
        return revenueRepository.findByUser(user);
    }
}