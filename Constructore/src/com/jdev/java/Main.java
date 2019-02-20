package com.jdev.java;

public class Main {

    public static void main(String[] args) {
//	    BankAccount jorge_acc = new BankAccount("123456","403-578-7878",1000000D,"Jorge Avila","jorge.me@gmail.com");
//        //BankAccount jorge_acc = new BankAccount();
//        System.out.println(jorge_acc.getBalance());
//        System.out.println(jorge_acc.getCustomer_name());
//        System.out.println(jorge_acc.getEmail());
//        System.out.println(jorge_acc.getNumber());
//        System.out.println(jorge_acc.getPhone());
//	    jorge_acc.withdrawal(100.0);
//	    jorge_acc.deposit(50.0);
//	    jorge_acc.withdrawal(10.0);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob",25151.2);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim","bob@email.com",25151.2);
        System.out.println(person3.getName());


    }
}
