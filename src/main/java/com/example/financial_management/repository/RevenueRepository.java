package com.example.financial_management.repository;

import com.example.financial_management.models.Revenue;
import com.example.financial_management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RevenueRepository extends JpaRepository<Revenue, Integer> {
    List<Revenue> findByUser(User user);
    boolean existsByUserAndMonthBetween(User user,Date startDate, Date endDate);

    Revenue findByUserAndMonthBetween(User user, Date startDate, Date endDate);
    List<Revenue> findAllByUserAndMonthBetween(User user, Date startDate, Date endDate);
}
