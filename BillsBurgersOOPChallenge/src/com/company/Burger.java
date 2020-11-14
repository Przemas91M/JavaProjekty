package com.company;
class addOns{
    private String name;
    private double price;

    public addOns(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Tomato extends addOns{
    public Tomato(){
        super("Tomato", .50);
    }
}

class Lettuce extends addOns{
    public Lettuce(){
        super("Lettuce", .25);
    }
}

class Cheese extends addOns{
    public Cheese(){
        super("Cheese", .60);
    }
}

class Chips extends addOns{
    public Chips(){
        super("Chips", 1.25);
    }
}

class Cola extends addOns{
    public Cola(){
        super("Cola", 2.50);
    }
}

class Onion extends addOns{
    public Onion(){
        super("Onion", .30);
    }
}

class Feta extends addOns{
    public Feta(){
        super("Feta", .95);
    }
}

class Empty extends addOns{
    public Empty(){
        super("", 0.0);
    }
}

//klasa burgera podstawowego
public class Burger {
    private String roll;
    private String meat;
    private double basePrice = 4.50;
    private int maxAddons = 4;
    private double price = basePrice;
    private int addonCount = 0;
    private addOns addon1 = new Empty();
    private addOns addon2 = new Empty();
    private addOns addon3 = new Empty();
    private addOns addon4 = new Empty();

    //konstruktor
    public Burger(String roll, String meat){
        this.roll = roll;
        this.meat = meat;
    }

    public String getRoll() {
        return roll;
    }

    public String getMeat() {
        return meat;
    }

    public int getMaxAddons() {
        return maxAddons;
    }
    public double getBasePrice() {
        return basePrice;
    }

    public double getPrice() {
        return price;
    }

    public int getAddonCount() {
        return addonCount;
    }

    public addOns getAddon1() {
        return addon1;
    }

    public addOns getAddon2() {
        return addon2;
    }

    public addOns getAddon3() {
        return addon3;
    }

    public addOns getAddon4() {
        return addon4;
    }

    public void setAddon1(addOns addon1) {
        this.addon1 = addon1;
    }

    public void setAddon2(addOns addon2) {
        this.addon2 = addon2;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setMaxAddons(int maxAddons) {
        this.maxAddons = maxAddons;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printAddonSummary(){
        if(!addon1.getName().isEmpty()){
            System.out.println(this.addon1.getName());
            System.out.println("Addon price: " + addon1.getPrice());
            this.setPrice(this.getPrice() + addon1.getPrice());
        }
        if(!addon2.getName().isEmpty()){
            System.out.println(this.addon2.getName());
            System.out.println("Addon price: " + addon2.getPrice());
            this.setPrice(this.getPrice() + addon2.getPrice());
        }
        if(!addon3.getName().isEmpty()){
            System.out.println(this.addon3.getName());
            System.out.println("Addon price: " + addon3.getPrice());
            this.setPrice(this.getPrice() + addon3.getPrice());
        }
        if(!addon4.getName().isEmpty()){
            System.out.println(this.addon4.getName());
            System.out.println("Addon price: " + addon4.getPrice());
            this.setPrice(this.getPrice() + addon4.getPrice());
        }

    }
    //dorzucam dodatkowy skladnik
    public void addAddition(addOns addon){
        if(addon.getName() != null && this.addonCount < this.maxAddons) {
            this.addonCount++;
            switch (this.addonCount) {
                case 1:
                    this.addon1 = addon;
                    break;
                case 2:
                    this.addon2 = addon;
                    break;
                case 3:
                    this.addon3 = addon;
                    break;
                case 4:
                    this.addon4 = addon;
                    break;
                default:
                    break;
            }
        }
        else{
            System.out.println("Can't add more toppings!");
        }
    }
    /*wybieram dodatki
    1 - pomidor,
    2 - sałata
    3 - ser
    4 - cebula
    5 - feta
    6 - frytki
    7 - cola
     */
    public void selectAddon(char addon){
        switch(addon){
            case '1':
                addAddition(new Tomato());
                break;
            case '2':
                addAddition(new Lettuce());
                break;
            case '3':
                addAddition(new Cheese());
                break;
            case '4':
                addAddition(new Onion());
                break;
            case '5':
                addAddition(new Feta());
                break;
            default:
                System.out.println("Invalid input");
                return;
        }
    }

    public void order(){
        System.out.println("Burger order summary:");
        System.out.println("Burger type:" + this.getRoll());
        System.out.println("Meat selected:" + this.getMeat());
        System.out.println("Addons:");
        this.printAddonSummary();
        System.out.println("Total price for this burger: " + this.getPrice() + "$");
    }
}
