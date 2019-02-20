package com.jdev.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myInt = getIntegers(5);
        int[] sorted = sortArr(myInt);
        printArr(myInt);
        System.out.println("\n");
        printArr(sorted);

    }

    public static int [] getIntegers (int number) {

        int [] array = new int [number];
        System.out.println("Enter " + number + " integer values \r");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArr(int [] array) {

        for (int i = 0; i < array.length ; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortArr (int arr[]){

//        int[] sorted = new int [arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            sorted[i] = arr[i];
//        }

        int[] sorted = Arrays.copyOf(arr,arr.length);

         //Arrays.sort(sorted);

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;

            for (int i = 0; i < sorted.length-1 ; i++) {
                if (sorted[i] < sorted[i+1]){
                    temp =  sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }


        return sorted;

    }
}
