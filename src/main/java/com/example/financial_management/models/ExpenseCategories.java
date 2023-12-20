package com.example.financial_management.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class ExpenseCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany
    private List<NameCategories> nameCategories;

    public ExpenseCategories(int id, String name, List<NameCategories> nameCategories) {
        this.id = id;
        this.name = name;
        this.nameCategories = nameCategories;
    }

    public ExpenseCategories(String name, List<NameCategories> nameCategories) {
        this.name = name;
        this.nameCategories = nameCategories;
    }

    public ExpenseCategories() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameCategories(List<NameCategories> nameCategories) {
        this.nameCategories = nameCategories;
    }
}
