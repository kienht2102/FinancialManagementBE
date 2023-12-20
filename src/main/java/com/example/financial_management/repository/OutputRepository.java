package com.example.financial_management.repository;

import com.example.financial_management.models.Input;
import com.example.financial_management.models.Output;
import com.example.financial_management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OutputRepository extends JpaRepository<Output , Integer> {
    List<Output> findByUser(User user);
    List<Output> findByUserAndCreateAtBetween(User user, Date startDate, Date endDate);
}
