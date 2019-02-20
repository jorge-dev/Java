package com.jdev.java;

public class Contacts {

    private String name, phoneNumber;



    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createContact(String name, String phone){
        return new Contacts(name,phone);
    }
}
