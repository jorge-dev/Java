package com.jdev.java;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customer;

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public boolean newCustomer(String custName, double initAmt){

        if (findCustomer(name) == null){
            this.customer.add(new Customer(custName, initAmt));
            return true;
        }

        return false;

    }


    public boolean addTransactions(String name, double amount){
        Customer existingCust = findCustomer(name);
        if (existingCust != null){
            existingCust.addTransaction(amount);
            return true;
        }

        return false;

    }

    private Customer findCustomer (String name){
        for (int i = 0; i < customer.size() ; i++) {
            Customer checked = this.customer.get(i);
            if(checked.getName().equals(name)){
                return checked;
            }

        }
        return null;
    }


}
