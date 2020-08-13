package com.company;

public class Main {

    public static void main(String[] args) {
        char znak = 'D';
        char znakUnicode = '\u0044'; //znak D zapisany w Unicode
        System.out.println("Znak normalnie: " + znak);
        System.out.println("Znak w Unicode: " + znakUnicode);
        char znakCopyright = '\u00A9';
        System.out.println("Znak praw autorskich: " + znakCopyright);

        boolean varTrue = true;
        boolean varFalse = false;
    }
}
