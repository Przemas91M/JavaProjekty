package com.company;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly(); //wywołamy metodę nadrzędną ale pingwin nie umie latać
        System.out.println("I can't fly, better go swimming!");
    }
}
