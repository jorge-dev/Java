package com.jdev.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String test = getDurationString(61,00);
        String test2 = getDurationString(3945);
        System.out.println(test);
        System.out.println(test2);
    }

    private static String getDurationString ( int minutes, int seconds){
        String time = "0h 0m 0s";
        int hours;
        int remMinutes;
        if ( minutes < 0 || (seconds < 0 || seconds > 59)){
            time = "Invalid Value, Can't calculate time.";
        }
        else {
            hours  = minutes / 60;
            remMinutes = minutes % 60;

            String h = hours + "h ";
            String m = remMinutes + "m ";
            String s = seconds + "s ";

            if (hours < 10){
                h = "0" + h;
            }
            if (remMinutes < 10){
                m = "0" + m;
            }
            if (seconds < 10){
                s = "0" + s;
            }
            time = h + m + s;

        }
        return time;
    }

    private static String getDurationString (int seconds){
        String time = "0h 0m 0s";
        int minutes;
        int remSeconds;
        if (seconds < 0){
            time = "Invalid Value, Can't calculate time.";
        }
        else {
            minutes  = seconds / 60;
            remSeconds = seconds % 60;

            time = getDurationString(minutes,remSeconds);

        }
        return time;
    }
}
