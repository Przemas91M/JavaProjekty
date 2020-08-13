package com.company;

public class Main {

    public static void main(String[] args) {
        int mojaWartosc = 10000;
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimalna wartosc integera = " + minIntValue);
        System.out.println("Maksymalna wartosc integera = " + maxIntValue);
        System.out.println("Przeladowana maksymalna wartosc integera = " + (maxIntValue + 1));
        System.out.println("Przeladowana minimalna wartosc integera = " + (minIntValue - 1));
        int maxIntTest = 2_147_483_647; //mozna zapisac w ten sposób

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimalna wartosc byte = " + minByteValue);
        System.out.println("Maksymalna wartosc byte = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Minimalna wartosc Short = " + minShortValue);
        System.out.println("Maksymalna wartosc Short = " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimalna wartosc Long = " + minLongValue);
        System.out.println("Maksymalna wartosc Long = " + maxLongValue);
        long mojaWartoscLong = 2_147_483_647_234L;  //bez L liczba bedzie traktowana jako int i bedzie mozna wpisac tylko maksymalna wartosc dla inta

        byte dzialanieByte = (byte) (minByteValue / 2); //rzutowanie

        short dzialanieShort = (short) (minShortValue / 2); //rzutowanie

        /* challenge */

        byte var1 = 10;
        short var2 = 25;
        int var3 = 141;
        long sum = 50000L + 10L * (var1 + var2 + var3);
        System.out.println("Suma challenge: " + sum);
        short suma = (short) (1000 + 10 * var1 + var2 + var3); //przekroczy wartosc shorta
        System.out.println("Suma short challenge: "+ suma);
    }
}
