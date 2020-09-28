package com.company;

public class Main {

    public static void main(String[] args) {
	String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
        number ++;
        numberAsString += 1;
        System.out.println("numberAsString + 1 = " + numberAsString);
        System.out.println("number + 1 = " + number);
    numberAsString = "2018.125";
        double numberD = Double.parseDouble(numberAsString);
        System.out.println("numberAsString double = " + numberD);
    }
}
