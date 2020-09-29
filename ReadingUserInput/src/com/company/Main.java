package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //obsluga klikniecia enter

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            yearOfBirth = 2020 - yearOfBirth;
            if(yearOfBirth >= 0 && yearOfBirth <= 100){
                System.out.println("Your name is: " + name + ", and you are "+yearOfBirth + " years old.");
            } else {
                System.out.println("Invalid Value");
            }
        }
        else{
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
