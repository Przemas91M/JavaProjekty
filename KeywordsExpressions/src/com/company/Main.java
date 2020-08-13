package com.company;

public class Main {

    public static void main(String[] args) {
        // 1 mila to 1.609344 kilometra
        double kilometry = (100 * 1.609344); //double nie zalicza się do wyrażenia! kilometry = .... to wyrażenie.
        int score = 50;
        if (score == 50) {   //tutaj wyrażeniem jest tylko score == 50, reszta nie jest brana pod uwagę
            System.out.println(score);
        }
        //wciecia, znaki białe itp
        int var = 50;   //całość to  deklaracja. samo var = 50 (bez średnika) to wyrażenie.

        boolean gameOver = true;
        score = 4500;
        int levelCompleted = 5;
        int bonus = 100;

        if (score <= 5000 && score > 1000){
            System.out.println("Your score is less or equal 5000 and greater than 1000"); //mozna bez klamr ale wtedy wykona się tylko pierwsza linia kodu
        }else if(score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Your score is more than 5000");
        }
        /** challenge **/
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score is: " + finalScore);
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + ( levelCompleted * bonus);
            System.out.println("Final score is: " + finalScore);
        }
    }
}
