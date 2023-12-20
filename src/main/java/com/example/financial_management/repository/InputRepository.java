package com.example.financial_management.repository;

import com.example.financial_management.models.Input;
import com.example.financial_management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface InputRepository  extends JpaRepository<Input ,Integer> {
    List<Input> findByUser(User user);
    List<Input> findByUserAndCreateAtBetween(User user, Date startDate, Date endDate);
    @Query("SELECT COALESCE(SUM(i.money), 0) FROM Input i WHERE i.user.id = :userId " +
            "AND i.createAt BETWEEN :startDate AND :endDate")
    long findMonthlySalary(@Param("userId") Long userId,
                           @Param("startDate") Date startDate,
                           @Param("endDate") Date endDate);
}
