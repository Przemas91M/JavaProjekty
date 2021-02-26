package com.company;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //w tym przypadku wymagam, by klasa dziedzicząca zaimplementowała te metody
    //normalnie klasa dziedzicząca ma tylko metody bazowe i nie musi ich modyfikować
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
