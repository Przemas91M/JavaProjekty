package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        result = result - 1; //3 - 1 = 2
        System.out.println("Wynik = " + result);
        result = result * 10;
        System.out.println("Wynik * 10 = " + result);
        result = result / 2;
        System.out.println("Wynik / 2 = " + result);
        result = result % 3; //tutaj wystawi tylko resztę z operacji modulo 10 % 3 = 1
        System.out.println("Wynik % 3 = " + result);

        //skrócona wersja
        result++; //result = 1 + 1
        System.out.println("Wynik++ = " + result);
        result *= 10; //mnożenie * 10 - skrócona wersja. Dla pozostałych operatorów tak samo.
        System.out.println("Wynik * 10 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 100;     //operatory takie same jak w C# < > != <= >= && ||
        if (topScore == 100){
            System.out.println("You got the high score!");
        }
        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is an error");
        }
        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not suposed to happen");
        }
        //operator trójkowy
        boolean wasCar = isCar ? true : false; //jezeli wasCar == isCar to przypisze mu true, w przeciwnym przypadku false.
        if (!wasCar){
            System.out.println("wasCar jest false");
        }
        int ageOfClient = 18;
        boolean isClient20 = ageOfClient >= 20 ? true : false ; //sprawdza, czy klient ma 20 lat. Jeżeli tak, przypisze true, jeżeli nie false.
        System.out.println("Is client 20 years old? " + isClient20);

        /* challenge */
        double var1 = 20.00;
        double var2 = 80.00;
        double out = ((var1 + var2) * 100.00d) % 40.00d;
        System.out.println("Remainder (out) = " + out);
        boolean isRemainder = (out == 0.00d) ? true : false;
        System.out.println("Remainder is " + isRemainder);
        if (!isRemainder){
            System.out.println("Got some remainder");
        }
    }
}
