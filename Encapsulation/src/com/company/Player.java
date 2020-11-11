package com.company;

public class Player {
    //zła metoda na udostępnianie danych w klasie, ktoś kto będzie pisał kod po nas, może namieszać w programie
    public static String name;
    public static int health;
    public static String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player dead");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
