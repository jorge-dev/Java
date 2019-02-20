package com.jdev.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i <10 ; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));

       int[] newArr = arr;
       reverse(newArr);
        System.out.println(Arrays.toString(newArr));

    }

    private static void reverse(int[] array){

        int max = array.length -1;
        int halfLen = array.length/2;
        for (int i = 0; i <halfLen ; i++) {
            int temp = array[i];
            array[i] = array[max -i];
            array[max - i] = temp;
        }
    }
}
