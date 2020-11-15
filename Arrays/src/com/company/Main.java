package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = new int[10];
        int[] scannerArray = getIntegers(6);
        //pare metod inicjalizacji
        // na sztywno:
        //intArray[0] = 5;
        //intArray[2] = 2; etc..
        //przypisać przy deklaracji:
        //int[]intArray = {1,2,3,4,5,6,7,8,10};
        //albo metodą:
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10;
        }
        //printArray(intArray);
        printArray(scannerArray);
        //System.out.println(meanArrayValue(scannerArray));
        printArray(sortArray(scannerArray));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is: " + array[i]);
        }
    }

    public static int[] getIntegers(int count) {
        int[] returnArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter int value number " + i + ": \r");
            returnArray[i] = scanner.nextInt();
        }
        return returnArray;
    }

    public static double meanArrayValue(int[] array) {
        int meanValue = 0;
        for (int i = 0; i < array.length; i++) {
            meanValue += array[i];
        }
        return (double) meanValue / (double) array.length;
    }

    //challenge - funkcja układająca liczby w wektorze od najwiekszej do najmniejszej
    public static int[] sortArray(int[] array) {
        int[] workingArray = array;
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i<workingArray.length - 1 ; i++){
                if(workingArray[i] < workingArray [i+1]){   //jezeli ta liczba jest mniejsza od nastepnej
                    temp = workingArray[i];               //przypisuje ja do tempa
                    workingArray[i] = workingArray[i+1];    //przepisuje wyzsza liczbe do obecnej
                    workingArray[i+1] = temp;             //przepisuje nizsza liczbe na nastepna pozycje
                    flag = true;                        //odpalam while od nowa
                }
            }
        }
        return workingArray;

    }
}
