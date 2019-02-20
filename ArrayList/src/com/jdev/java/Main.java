package com.jdev.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static GroceryList g = new GroceryList();
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            System.out.println("Enter a choice:");
            choice = s.nextInt();
            s.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    g.printGrocertList();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    private static void printInstructions(){

        System.out.println("\n Press");
        System.out.println("\t 0 -- To print choice of options");
        System.out.println("\t 1 -- To print the grocery list");
        System.out.println("\t 2 -- To add an item to the list");
        System.out.println("\t 3 -- To modify an item in the list");
        System.out.println("\t 4 -- To remove an item from the list");
        System.out.println("\t 5 -- To search an item in the list");
        System.out.println("\t 6 -- To quit the application");
    }

    private static void add(){
        System.out.println("Enter the grocery item: ");
        g.addItem(s.nextLine());

    }

    private static void modify(){
        System.out.println("Enter the grocery item to modify: ");
        String item1 = s.nextLine();
        System.out.println("Enter replacement item: ");
        String item2 = s.nextLine();
        g.modifyItem((item1),item2);

    }

    private static void remove(){
        System.out.println("Enter grocery item  to remove: ");
        g.removeItem(s.nextLine());

    }

    private static void search(){
        System.out.println("Enter the item you want to search for: ");
        String found = s.nextLine();
        if(g.onFile(found))
            System.out.println("Found " + found + " in your grocery list.");
        else{
            System.out.println(found + " is not in the shopping list");
        }


    }

    public static void processArrayList(){
        ArrayList<String> newArr = new ArrayList<>();
        newArr.addAll(g.getGroceries());

        ArrayList<String> nextArr = new ArrayList<>(g.getGroceries());

        String[] myArr = new String[g.getGroceries().size()];
        myArr = g.getGroceries().toArray(myArr);


    }

}
