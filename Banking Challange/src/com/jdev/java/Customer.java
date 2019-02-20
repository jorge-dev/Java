package com.jdev.java;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initAmt) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initAmt);
    }

    public void addTransaction (double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
