package com.jdev.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double test = calcFeetAndInchesToCentimeters(0, 1);
        double test2 = calcFeetAndInchesToCentimeters(75);

    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        double resultInCent ;
        double feetToIn ;
        double totInc ;
        if ((feet < 0) || (inches < 0 || inches > 12) ) {
            System.out.println("Invalid feet or inches parameters");
            resultInCent = -1;
        }
        else{
            feetToIn = feet * 12;
            totInc = feetToIn + inches;
            resultInCent = totInc * 2.54;
            System.out.println(feet +" Feet, "+ inches + " inches = " + resultInCent + " centimeters" );
        }

        return resultInCent;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {

        double resultInCent ;
        if (inches < 0 ){
            System.out.println("Invalid inches parameter");
            resultInCent = -1;
        }
        else{
            resultInCent = inches * 2.54;
            System.out.println( inches + " inches = " + resultInCent + " centimeters" );
        }

        return resultInCent;
    }
}
