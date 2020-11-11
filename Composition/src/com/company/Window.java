package com.company;

public class Window {
    private int height;
    private int width;
    private String frameColor;

    public Window(int height, int width, String frameColor) {
        this.height = height;
        this.width = width;
        this.frameColor = frameColor;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getFrameColor() {
        return frameColor;
    }

    public void getFreshAir(){
        System.out.println("Window opened");
    }

    public void closeWindow(){
        System.out.println("Window closed");
    }
}
