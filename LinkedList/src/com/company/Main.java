package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; //to jest wskaznik, przez co zmienimy wartosc w obu klasach
        anotherCustomer.setAmount(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getAmount()); //wyswietli 12.18 bo mam wskaznik ustawiony na pierwsza klase


        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);  //to dorzuci nam '2' w miejsce o indeksie 1. Pozostałe elementy przesunie niżej

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
