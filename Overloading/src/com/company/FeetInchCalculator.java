package com.company;

public class FeetInchCalculator {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >=0 && inches >=0 && inches <=12){
            double centimeters = (feet * 12) + inches;  //policzy ile w sumie mam cali
            centimeters *= 2.54d;                       //przeliczy na centmetry
            return centimeters;
        } else {
            return -1d;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            int feet = (int)inches / 12;
            inches %= 12;
            double centimeters = calcFeetAndInchesToCentimeters((double)feet, inches);
            System.out.println("Wyliczyłem: " + feet + " stóp i " + inches + " cali.");
            return centimeters;
        } else {
            return -1d;
        }
    }
}
