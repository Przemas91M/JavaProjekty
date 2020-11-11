package com.company;

public class BetterPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public BetterPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100){ //jak wpiszemy w konstruktor np. 200 to program odrzuci i zostawi 100
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player dead");
        }
    }

    public int getHealth() {
        return health;
    }
}
