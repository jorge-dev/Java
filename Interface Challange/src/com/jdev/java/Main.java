package com.jdev.java;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player jorge = new Player("Jorge",100,100);
        System.out.println(jorge.toString());
        saveObj(jorge);

        jorge.setHitPoints(99);
        System.out.println(jorge.toString());
        jorge.setStrength(99);
        System.out.println(jorge.toString());
        jorge.setWeapon("Gun");
        System.out.println(jorge.toString());

        saveObj(jorge);
    //    loadObj(jorge);
        System.out.println(jorge);

        ISaveable werewolf = new Monster("Werewolf",20,89);
        System.out.println(werewolf);
        saveObj(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static  void saveObj(ISaveable obj){
        for (int i = 0; i < obj.write().size() ; i++) {
            System.out.println("Saving " + obj.write().get(i) + " to storage device");
        }
    }

    public static void loadObj(ISaveable obj){
        ArrayList<String> values = readValues();
        obj.read(values);
    }
}
