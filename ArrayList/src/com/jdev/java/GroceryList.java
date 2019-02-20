package com.jdev.java;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceries = new ArrayList<>();

    public void addItem (String item){
        groceries.add(item);
    }

    public void printGrocertList(){
        System.out.println("You have " + groceries.size() + " items in your grocery list");
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println(i+1 + ". " + groceries.get(i));
        }
    }

    public void modifyItem(String current ,String newItem){
        int position = findItem(current);

        if (position >= 0)
            modifyItem(position,newItem);

    }
    private void modifyItem(int position, String newItem){
        groceries.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");

    }

    public void removeItem (String item){
        int position = findItem(item);

        if (position >= 0)
            removeItem(position);
    }

    private void removeItem (int position) {
        String item = groceries.get(position);
        groceries.remove(item);
    }

    private int findItem(String item){

        return groceries.indexOf(item);


    }

    public ArrayList<String> getGroceries() {
        return groceries;
    }

    public boolean onFile(String search){
        int position = findItem(search);
        if (position >= 0)
            return true;
        else
            return false;
    }
}
