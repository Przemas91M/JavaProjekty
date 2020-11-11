package com.company;

public class Printer {
    private String model;
    private String manufacturer;
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplexPrinter;

    public Printer(String model, String manufacturer, int tonerLevel, boolean isDuplexPrinter) {
        this.model = model;
        this.manufacturer = manufacturer;
        if(tonerLevel < 0 || tonerLevel >=100){
            this.tonerLevel = tonerLevel;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(int tonerVolume){
        if(tonerVolume <= 0 || tonerVolume > 100){ //sprawdzam ile tonera chce dodac, uwaga na wartości ujemne!
            System.out.println("Invalid value!");
            return;
        }
        if(this.tonerLevel + tonerVolume > 100){ //jezeli dodam za duzo tonera
            System.out.println("Too much toner!");
            return;
        }
        this.tonerLevel += tonerVolume;
    }

    public void printPages(int pages){
        int pagesAdded = pages;
        if(isDuplexPrinter){
            pagesAdded = (pages / 2) + (pages % 2) ;
            System.out.println("Printing in duplex mode!");
        }
        this.pagesPrinted += pagesAdded;
        System.out.println("Printed " + pagesAdded + " physical pages.");
        System.out.println("Printed total of " + pages + " pages.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
