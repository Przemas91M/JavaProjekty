package com.company;

public class Fish extends Animal {
    private  int gills;
    private int eyes;
    private int fins;

    public Fish(int size, int weight, String name, int gills, int eyes, int fins) {
        super(1, 1, size, weight, name); //tutaj tak samo definiuje na stale, ze ryba ma mozg i cialo
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest() {

    }

    private void moveMuscles(){

    }
    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
