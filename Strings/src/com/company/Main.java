package com.company;

public class Main {

    public static void main(String[] args) {
        String napis = "This is a string";
        System.out.println(napis);
        napis = napis + ", and there's more.";
        System.out.println(napis);
        napis = napis + "\u00A9 2020";
        System.out.println(napis);
        String lastString = "10";
        lastString = lastString + 120.47d; //mozna dodawać stringi, inty, double itp
        System.out.println(lastString);
    }
}
