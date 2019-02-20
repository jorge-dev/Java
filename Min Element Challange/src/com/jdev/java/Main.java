package com.jdev.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter number of integers for array;: ");
        validNum();
        int num = scanner.nextInt();
        System.out.println("num  = " + num);

        int[] array = readInt(num);

        System.out.println(Arrays.toString(array));

        int min = findMin(array);

        System.out.println("The minimum value in the array is " + min);

        scanner.close();

    }


    public static int[] readInt(int count) {

        int[] arr = new int[count];

        System.out.println("PLease enter "+ count +" numbers");
        for (int i = 0; i < arr.length ; i++) {
            validNum();
            arr[i] = scanner.nextInt();
            scanner.nextLine();

        }


        return arr;

    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if (min > arr[i])
                min = arr[i];

        }

        return min;

    }

    public static void validNum (){

        boolean isNUm = scanner.hasNextInt();

        while (!isNUm){
            System.out.println("That's not a number. Please enter a correct number");
            scanner.nextLine();
            isNUm = scanner.hasNextInt();

        }

    }


}
