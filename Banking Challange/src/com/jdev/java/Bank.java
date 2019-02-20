package com.jdev.java;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch (String name){

        if (findBranch(name) == null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer (String branchName, String customerName, double initAmt){
        Branch branch = findBranch(branchName);

        if (branch != null){
            return branch.newCustomer(customerName,initAmt);

        }
        return false;

    }

    public boolean addCustTransaction (String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);

        if (branch != null){
            return branch.addTransactions(customerName,amount);
        }
        return false;
    }

    private Branch findBranch (String name){
        for (int i = 0; i < branches.size() ; i++) {
            Branch checked = this.branches.get(i);
            if(checked.getName().equals(name)){
                return checked;
            }

        }
        return null;
    }


    public boolean listCustomers (String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);

        if (branch != null){
            System.out.println("Customer details for branch " + branch.getName() );

            ArrayList<Customer> branchCustomers = branch.getCustomer();
            for (int i = 0; i < branchCustomers.size() ; i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + branchCustomer.getName() + "[ " + (i+1) + "]");

                if (showTransactions){
                    System.out.println("Transactions: ");
                    ArrayList<Double> trans = branchCustomer.getTransactions();
                    for (int j = 0; j < trans.size() ; j++) {
                        System.out.println("[" + (j+1) + "] Amount " + trans.get(j));

                    }
                }
            }
            return true;
        }
        else
            return false;
    }




























}
