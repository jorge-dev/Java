package com.jdev.java;

import java.util.ArrayList;

public class MobilePhone {

    private String phoneNUmber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addContact (Contacts contact){
        if (findContact(contact.getName()) >= 0) {
            System.out.println(contact.getName() + " is already on file");
            return false;
        }
        else{
            myContacts.add(contact);
            return true;
        }
    }

    public boolean removeContact (Contacts contact){
        int foundPos = findContact(contact);
        if(foundPos < 0){
            System.out.println(contact.getName() + " Not found");
            return false;
        }
         this.myContacts.remove(foundPos);
        System.out.println(contact.getName() + " was removed ");
        return true;
    }


    public boolean updateContact (Contacts oldCon, Contacts newCon){
        int foundPos = findContact(oldCon);
        if(foundPos < 0){
            System.out.println(oldCon.getName() + " Not found");
            return false;
        }
        else if (findContact(newCon.getName()) != -1){
            System.out.println("Contact with name: " + newCon.getName() + " already exists ");
            return false;
        }

        this.myContacts.set(foundPos,newCon);
        System.out.println(oldCon.getName() + " was replaced with " + newCon.getName());
        return true;

    }

    private int findContact (Contacts contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact (String name ){
        for (int i = 0; i <myContacts.size() ; i++) {
            Contacts contact = this.myContacts.get(i);
            if (contact.getName().equals(name) ){
                return i;
            }
        }
        return -1;
    }

    public String queryContact (Contacts contact ){
        if (findContact(contact) >= 0)
            return contact.getName();
        else
            return null;
    }

    public Contacts queryContact(String name){
        int pos = findContact(name);
        if (pos >= 0){
            return this.myContacts.get(pos);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List: ");
        for (int i = 0; i <myContacts.size() ; i++) {
            System.out.println((i+1) + ". " +
                                this.myContacts.get(i).getName() + " --> " +
                                this.myContacts.get(i).getPhoneNumber());
        }

    }
}
