package com.jdev.java;

public class VipPerson {
    private String name, email;
    private double creditLimit;

    public VipPerson(String name, double creditLimit) {
        this(name,"default@email",creditLimit);
    }

    public VipPerson(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipPerson() {
        this("Default Name","default@email",50000.0);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
