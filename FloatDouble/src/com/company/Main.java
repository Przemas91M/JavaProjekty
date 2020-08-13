package com.company;

public class Main {

    public static void main(String[] args) {
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Minimalna wartosc float: " + minFloat);
        System.out.println("Maksymalna wartosc float: " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Minimalna wartosc double: " + minDouble);
        System.out.println("Maksymalna wartosc double: " + maxDouble);

        int varInt = 5 / 2;
        float varFloat = 5f / 3f;     //trzeba dac znak na koncu wartosci, domyslnie jest double
        double varDouble = 5d / 3d;
        System.out.println("Wartosc int= " + varInt);
        System.out.println("Wartosc float= " + varFloat);
        System.out.println("Wartosc double= " + varDouble);

        double wartosc = 3_000_000.4_567_890d; //tak tez mozna zapisac

        /* challenge - przelicz funty na kilogramy */
        double funty = 5.8d;
        double kilogramy = funty * 0.45359237d;
        System.out.println("5,8 funta to: " + kilogramy + " kilogramów.");
    }
}
