package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        //cwiczenie
        char variable = 'F';
        switch (variable) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found A,B,C,D or E");
                break;
            default:
                System.out.println("A,B,C,D or E was not found");
                break;
        }
        String month = "JanUary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "july":
                System.out.println("Jul");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
