package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;

        }
        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        count = 0;
        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){  //jezeli liczba jest nieparzysta
                continue;               //continue powoduje przeskok na poczatek pętli
            }
            System.out.println("Even number= " + number);
            count++;
            System.out.println("Found " + count + " even numbers.");
            if(count == 5){
                break;
            }
        }
        System.out.println("Found total of " + count + " even numbers.");
    }
    public static boolean isEvenNumber(int parameter){
        return (parameter % 2 == 0);
    }
}
