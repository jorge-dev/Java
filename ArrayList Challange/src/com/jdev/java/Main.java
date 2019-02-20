package com.jdev.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("555-555-555");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while(!quit){
            System.out.println("\nEnter action: (6 to show available actions");
            int action = s.nextInt();
            s.nextLine();

            switch (action){
                case 0:
                    System.out.println("Shutting down....");
                    quit = true;
                    break;

                case 1:
                    printContacts();
                    break;

                case 2:
                    add();
                    break;

                case 3:
                    update();
                    break;

                case 4:
                    remove();
                    break;

                case 5:
                    search();
                    break;

                case 6:
                    printActions();
                    break;

            }

        }

    }

    private static void printContacts(){
        mobilePhone.printContacts();

    }

    private static void add(){
        System.out.println("Add contact name: ");
        String name = s.nextLine();
        System.out.println("Add contact phone number");
        String number = s.nextLine();
        Contacts newContact = Contacts.createContact(name,number);
        if(mobilePhone.addContact(newContact)){
            System.out.println("New contact added: " + name + ", phone = " + number );
        }
        else
            System.out.println("Can't add contact. " + name +" already on file");
    }

    private static void update(){
        System.out.println("Enter existing contact name to update: ");
        String oldCon = s.nextLine();
        Contacts existingCon = mobilePhone.queryContact(oldCon);

        if (existingCon == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name");
        String newName = s.nextLine();
        System.out.println("Enter new contact phone");
        String newPhone = s.nextLine();
        Contacts newCon = Contacts.createContact(newName,newPhone);
        if( mobilePhone.updateContact(existingCon,newCon))
            System.out.println("Successful update");
        else
            System.out.println("Error occurred. Contact not updated");
    }

    private static void remove(){

        System.out.println("Enter contact name to remove: ");
        String oldCon = s.nextLine();
        Contacts existingCon = mobilePhone.queryContact(oldCon);
        if (existingCon == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingCon))
            System.out.println("Contact successfully removed");
        else
            System.out.println("Error occurred. Contact not removed");

    }

    private static void search(){

        System.out.println("Enter contact name to search: ");
        String oldCon = s.nextLine();
        Contacts existingCon = mobilePhone.queryContact(oldCon);
        if (existingCon == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingCon.getName() + ", phone = " + existingCon.getPhoneNumber());

    }

    private static void startPhone(){
        System.out.println("Starting Phone ........");

    }

    private static void printActions(){

        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 -- To shutdown\n" +
                           "1 -- To Print Contacts\n" +
                           "2 -- To add Contact \n" +
                           "3 -- To update existing contact\n" +
                           "4 -- To remove Contact\n"+
                           "5 -- to search for contact\n" +
                           "6 -- To print list of available options\n" );
        System.out.println("Choose your action: ");
    }
}
