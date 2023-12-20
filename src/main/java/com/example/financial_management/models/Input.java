package com.example.financial_management.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private long money;
    @CreationTimestamp
    private Date createAt;
    @ManyToOne
    private User user;

    public Input(String title, long money, Date createAt, User user) {
        this.title = title;
        this.money = money;
        this.createAt = createAt;
        this.user = user;
    }

    public Input() {
    }
}
