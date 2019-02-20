package com.jdev.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of 125 is = "+ sumDigits(125));
        System.out.println("Sum of -125 is = "+ sumDigits(-125));
        System.out.println("Sum of 4 is = "+ sumDigits(4));
        System.out.println("Sum of 32123 is = "+ sumDigits(32123));

    }

    public static int sumDigits(int number){



        if ( (number < 10) )
           return -1;

        int sum = 0, ones;



        while (number > 0){


            // extract least sig digit
            ones = number % 10;
            sum +=  ones;

            // drop the least sig digit
            number /= 10;
        }

        return sum;





    }
}
