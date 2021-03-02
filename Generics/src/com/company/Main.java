package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*można również użyć definicji bez nawiasów <>. ale wtedy nie mam
        zdefiniowanego typu danych w liście. przez to moge do listy dodac np stringa co wysypie mi kod
        bo funkcja printDoubled nie doda mi stringa do integera.*/
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        //items.add("tim"); - w starej wersji javy mozna tak zrobic, teraz wywali mi błąd
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);



        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //Team adelaideCrows = new Team("Adelaide Crows"); - bez typu, klasa przyjmuje kazdy typ zawodnika
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//        adelaideCrows.addPlayer(pat); - to nie zadziała, gdy mamy typ przyjmowanych obiektów przez klasę
//        adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat); //mozna go dodac bez problemu

        //to zadziała, gdy nie użyjemy przypisanego typu. Java nie sprawdzi podanego typu i wysypie się program.
//        Team<String> brokenTeam = new Team<>("this won't work");
//        brokenTeam.addPlayer("no-one");

        Team<SoccerPlayer> soccerTeam = new Team<>("Manchester United");
        soccerTeam.addPlayer(beckham);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle,2 ,1);
//        adelaideCrows.matchResult(baseballTeam, 1,3); - to wywali błąd, gdyż mamy różne typy drużyn.

        System.out.println("Rankings:");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println( i * 2 );
        }
    }
}
