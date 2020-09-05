package com.company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
    }

    private static String getDurationString(int min, int sec) { //72 min 36sek
        if (min >= 0 && sec >= 0 && sec <= 59) {
            int hours = min / 60;    //wyliczam godziny z minut
            String hoursS = hours + "h";
            int minutes = min % 60; //wyliczam pozostałe minuty
            String minutesS = minutes + "m";
            String secS = sec + "s";
            if(hours < 10){
                hoursS = "0" + hoursS;
            }
            if(minutes < 10){
                minutesS = "0" + minutesS;
            }
            if(sec < 10){
                secS = "0" + secS;
            }
            return hoursS + " " + minutesS + " " + secS;
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    private static String getDurationString(int sec) {
        if (sec >= 0) {
            int minutes = sec / 60;
            int secs = sec % 60;
            System.out.println("There are " + minutes + " minutes and " + secs + " seconds in " + sec + " seconds.");
            System.out.println("Passing values to second method...");
            return getDurationString(minutes, secs);
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }
}
