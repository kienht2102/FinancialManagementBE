package com.example.financial_management.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private User user;
    private long totalAmount;
    private Date latestUpdate;

    public Expense(int id, User user, long totalAmount, Date latestUpdate) {
        this.id = id;
        this.user = user;
        this.totalAmount = totalAmount;
        this.latestUpdate = latestUpdate;
    }

    public Expense(User user, long totalAmount, Date latestUpdate) {
        this.user = user;
        this.totalAmount = totalAmount;
        this.latestUpdate = latestUpdate;
    }

    public Expense() {
    }
}