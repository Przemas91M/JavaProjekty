package com.company;
public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal(1,1,5,5,"Animal");
	Dog dog = new Dog(8, 20, "York", 2, 4,1,20,"long");
	dog.eat();
	dog.walk();
	dog.run();

    }
}