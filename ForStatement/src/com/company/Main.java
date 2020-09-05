package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        for(int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }
        for(int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }
        int count = 0;
        for(int i = 1; i < 100; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Found " + count +" prime numbers, this one is:" + i);
                if(count == 10){
                    break;
                }
            }
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i<= (long)Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
