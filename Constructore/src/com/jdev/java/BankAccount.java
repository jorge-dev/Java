package com.jdev.java;

public class BankAccount {


    private  double balance;
    private String customer_name, email, phone, number;

    public BankAccount(){
        this("123456564","403-555-8888",0.0,"John Smith","johnsmith@me.com");
    }

    public BankAccount(String number, String phone, double balance, String customer_name, String email){
        this.number = number;
        this.phone = phone;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
    }

    public void deposit (double amount){
        balance += amount;
        System.out.println("Deposit of $"+ amount + " made. New balance is $"+ balance);
    }

    public void withdrawal(double amount){
        if (balance - amount < 0) {
            System.out.println("Only $" + balance + " available. Withdrawal not processed");

        }else {
            balance -= amount;
            System.out.println("Withdrawal of $"+ amount + " processed. Remaining balance = $"+ balance);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
// =====================================================
    public String getNumber() {
        return number;
    }

    public String getPhone() {
        return phone;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }
}
