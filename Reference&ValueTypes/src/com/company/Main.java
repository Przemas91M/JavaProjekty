package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int intValue = 5;
        int nextIntValue = intValue;  //te zmienne przechowuja dane bezpośrednio w 'sobie'

        int[] intArray = new int[5];
        int[] anotherArray = intArray;  //taki zabieg tworzy tylko odniesienie do pamięci do pierwszego wektora.
        // Zmieniajac pierwszy wektor, zmieni sie tez drugi!!!

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherArray));

        intArray[0] = 1; //zmieni sie wartość w obu wektorach!

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] { 4, 5, 6, 7, 8}; //dereferencja - nowy obiekt.
        modifyArray(intArray);

        System.out.println("intArray after change = " + Arrays.toString(intArray));
        System.out.println("anotherIntArray after change = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0] = 2;//to dziala tak samo - modyfikuje oba wektory
        array = new int[] {1, 2, 3, 4, 5}; //to tworzy nowe odniesienie - nie modyfikuje obecnych wektorów
    }
}
