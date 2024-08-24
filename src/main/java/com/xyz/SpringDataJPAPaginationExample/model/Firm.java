package com.xyz.SpringDataJPAPaginationExample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Firm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String companyName;
    private int phoneNumber;

    public Firm(int id, String companyName, int phoneNumber) {
        this.id = id;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
    }

    public Firm() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
