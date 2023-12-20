package com.example.financial_management.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long revenue;
    private Date month;
    @ManyToOne
    private User user;

    public Revenue(int id, long revenue, Date month, User user) {
        this.id = id;
        this.revenue = revenue;
        this.month = month;
        this.user = user;
    }

    public Revenue(long revenue, Date month, User user) {
        this.revenue = revenue;
        this.month = month;
        this.user = user;
    }

    public Revenue() {
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}