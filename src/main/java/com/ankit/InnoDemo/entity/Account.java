package com.ankit.InnoDemo.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table()
public class Account {
    private int id;
    private String name;
    private String industry;
    private String accountRevenue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAccountRevenue() {
        return accountRevenue;
    }

    public void setAccountRevenue(String accountRevenue) {
        this.accountRevenue = accountRevenue;
    }
}
