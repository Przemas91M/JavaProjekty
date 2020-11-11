package com.company;

public class Main {

    public static void main(String[] args) {
        //nie powinniśmy w ten sposób udostępniać wszystkich danych w klasie
        Player player = new Player();
        Player.name = "Przemo";
        Player.health = 20;
        Player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        //prawidłowa metoda
        BetterPlayer player2 = new BetterPlayer("Tim", 100, "Pike");
        System.out.println("Initial health value: " + player2.getHealth());

        //challenge

        Printer printer = new Printer("LaserJet", "HP", 100, true);
        printer.printPages(4);
        printer.printPages(7);
        printer.getTonerLevel();
        printer.fillUpToner(2);
        System.out.println("Total printed pages: " + printer.getPagesPrinted());

    }
}
