package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int[] scannerArray = getIntegers(5);
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
        System.out.println(meanArrayValue(scannerArray));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is: " + array[i]);
        }
    }

    public static int[] getIntegers(int count){
        int[] returnArray = new int[count];
        for(int i = 0; i < count; i++)
        {
            System.out.println("Enter int value number " + i + ": \r");
            returnArray[i] = scanner.nextInt();
        }
        return returnArray;
    }

    public static double meanArrayValue(int[] array){
        int meanValue = 0;
        for(int i = 0; i < array.length; i++){
            meanValue += array[i];
        }
        return (double)meanValue / (double)array.length;
    }
}
