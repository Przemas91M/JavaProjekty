package com.company;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Final score is: " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Final score is: " + highScore);
        //wywolania funkcji z challenge
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Scott", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Tom", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Thom", position);
        
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Bradley", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Sebastian", position);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1; // -1 jest czesto uwazane za błąd dlatego w przypadku braku wyliczenia warto wystawić to jako błąd
    }
    /** challenge **/
    //funkcja wyswietlajaca pozycje gracza
    public static void displayHighScorePosition(String name, int position){
        System.out.println("Player " + name + " managed to get into position "
                + position + " on the high score table.");
    }
    public static int calculateHighScorePosition(int score) {
        //pierwsza wersja - dziala poprawnie
//        if(score >= 1000){
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        //druga wersja
        //zamiast za kazdym razem uzywac returna, przypisujemy wynik do zmiennej i na koncu ja wyrzucamy.
        int position = 4; //alternatywna metoda - zakladamy na poczatku najnizsza pozycje
        if(score >= 1000){
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }
        return position;
    }
}
