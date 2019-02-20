package com.jdev.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        boolean isNum = true;
        Scanner numbers = new Scanner(System.in);
        System.out.println("Give me 10 numbers \nLet's start");

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Number " +(i+1)+ ": ");
            //int num = numbers.nextInt();
            //1numbers.nextLine();
            isNum = numbers.hasNextInt();
            if (isNum){
                int num = numbers.nextInt();
                sum += num;
            }
            else {
                System.out.println("Invalid Number.");
                i--;

            }
            numbers.nextLine();
        }
        numbers.close();
        System.out.println("The total sum of the numbers you gave me is =" + sum);
    }
}
