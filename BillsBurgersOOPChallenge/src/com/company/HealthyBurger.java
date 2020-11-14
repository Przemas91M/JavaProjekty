package com.company;

public class HealthyBurger extends Burger {
    addOns addon5 = new Empty();
    addOns addon6 = new Empty();

    public HealthyBurger(String roll, String meat){
        super(roll, meat);
        this.setMaxAddons(6); //6 dodatków licząc od 0
        this.setBasePrice(5.0);
    }

    public addOns getAddon5() {
        return addon5;
    }

    public addOns getAddon6() {
        return addon6;
    }

    @Override
    public void addAddition(addOns addon) {
        super.addAddition(addon);
        switch(this.getAddonCount()){
            case 5:
                this.addon5 = addon;
                break;
            case 6:
                this.addon6 = addon;
                break;
            default:
                break;
        }
    }

    @Override
    public void printAddonSummary() {
        super.printAddonSummary();
        if(!addon5.getName().isEmpty()){
            System.out.println(this.addon5.getName());
            System.out.println("Addon price: " + addon5.getPrice());
            this.setPrice(this.getPrice() + addon5.getPrice());
        }
        if(!addon5.getName().isEmpty()){
            System.out.println(this.addon5.getName());
            System.out.println("Addon price: " + addon6.getPrice());
            this.setPrice(this.getPrice() + addon5.getPrice());
        }

    }
}
