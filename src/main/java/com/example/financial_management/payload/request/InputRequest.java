package com.example.financial_management.payload.request;


import jakarta.validation.constraints.NotBlank;

public class InputRequest {
    @NotBlank
    private String title;
    @NotBlank
    private long money;

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
}