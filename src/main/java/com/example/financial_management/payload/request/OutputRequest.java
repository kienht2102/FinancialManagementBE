package com.example.financial_management.payload.request;

import jakarta.validation.constraints.NotBlank;

public class OutputRequest {
    @NotBlank
    private String title;
    @NotBlank
    private long money;
    private String expenseType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }
}