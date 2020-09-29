package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is: " + porsche.getModel());
        porsche.setModel("126p");
        System.out.println("Model is: " + porsche.getModel());
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("substract = " + calculator.getSubstractionResult());
    }
}
