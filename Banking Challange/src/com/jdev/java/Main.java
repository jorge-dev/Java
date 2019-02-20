package com.jdev.java;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("RBC");
	    bank.addBranch("Calgary");
	    bank.addCustomer("Calgary","John Doe", 100.0);
	    bank.addCustomer("Calgary","Melie Bright", 1000.0);

	    bank.addBranch("Edmonton");
	    bank.addCustomer("Edmonton","Lucas Mers", 890.0);
	    bank.addCustomer("Edmonton","Steven Duncan", 30.0);

	    bank.addBranch("Banff");
	    bank.addCustomer("Banff","Mary Smith", 450.0);

	    bank.addCustTransaction("Calgary","John Doe", 300.9);
	    bank.addCustTransaction("Calgary","John Doe", 500.9);
	    bank.addCustTransaction("Calgary","Melie Bright", 600.9);
	    bank.addCustTransaction("Calgary","Melie Bright", 700.9);

        bank.addCustTransaction("Edmonton","Lucas Mers", 300.9);
        bank.addCustTransaction("Edmonton","Lucas Mers", 500.9);
        bank.addCustTransaction("Edmonton","Lucas Mers", 300.9);
        bank.addCustTransaction("Edmonton","Steven Duncan", 500.9);

        bank.addCustTransaction("Banff","Mary Smith", 300.9);
        bank.addCustTransaction("Banff","Mary Smith", 500.9);
        bank.addCustTransaction("Banff","Mary Smith", 300.9);
        bank.addCustTransaction("Banff","Mary Smith", 500.9);

        bank.listCustomers("Calgary",true);
        System.out.println("\n");
        bank.listCustomers("Edmonton",true
        );
        System.out.println("\n");
        bank.listCustomers("Banff",true);
        System.out.println("\n\n\n");


         bank.addBranch("Toronto");
        if (!bank.addCustomer("Toronto","Mia Sulivan", 8.99)){
            System.out.println("Error acount doesnt exist");
        }

        if (!bank.addBranch("Toronto")){
            System.out.println("Branch already exist");
        }

    }
}
