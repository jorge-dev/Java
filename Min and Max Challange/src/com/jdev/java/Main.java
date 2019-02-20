package com.jdev.java;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean isNum = true;
        while (true) {
            System.out.println("Enter number: ");
            isNum = scanner.hasNextInt();
            if (isNum){
                int num = scanner.nextInt();
                if(num > max)
                    max = num;

                if (num < min)
                    min = num;


            }else{
                System.out.println("Exit");
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("Min = " + min + " Max = " +max );
        scanner.close();

    }
}
