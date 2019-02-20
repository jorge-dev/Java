package com.jdev.java;

public class Main {

    public static void main(String[] args) {
	    printDayOfTheWeek(-2);
    }

    public static void printDayOfTheWeek (int day){
            String print;
            switch(day){
                case 0:
                    print = "Sunday";
                    break;
                case 1:
                    print = "Monday";
                    break;
                case 2:
                    print = "Tuesday";
                    break;
                case 3:
                    print = "Wednesday";
                    break;
                case 4:
                    print = "Thursday";
                    break;
                case 5:
                    print = "Friday";
                    break;
                case 6:
                    print = "Saturday";
                    break;
                default:
                    print = "Invalid Value";

            }
        System.out.println(print);
    }
}
