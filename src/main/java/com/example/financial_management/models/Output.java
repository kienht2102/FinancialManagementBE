package com.example.financial_management.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "TEXT")
    private String title;
    private long money;
    private Date createAt;
    @ManyToOne
    private User user;
    private String expenseType;

    public Output(String title, long money, Date createAt, User user, String expenseType) {
        this.title = title;
        this.money = money;
        this.createAt = createAt;
        this.user = user;
        this.expenseType = expenseType;
    }

    public Output() {

    }
}
