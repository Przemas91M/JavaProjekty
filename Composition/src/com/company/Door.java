package com.company;

public class Door {
    private int height;
    private int width;
    private String color;

    public Door(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void openDoor(){
        System.out.println("Opening door");
    }

    public void closeDoor(){
        System.out.println("Closing door");
    }
}
