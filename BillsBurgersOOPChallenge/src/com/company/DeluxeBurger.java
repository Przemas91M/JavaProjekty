package com.company;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(String roll, String meat){
        super(roll, meat);
        this.setBasePrice(7.5);
        this.setMaxAddons(2);
        super.addAddition(new Chips());
        super.addAddition(new Cola());
        //this.setAddon1(new Chips());
        //this.setAddon2(new Cola());
    }

    @Override
    public void addAddition(addOns addon) {
        System.out.println("Can't add anything!");
    }
}
