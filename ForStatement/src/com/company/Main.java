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
        count = 0;
        int sum = 0;
        for(int i = 1; i <=1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Number " + i + " met the conditions");
                sum += i;
                count++;
            }
            if(count == 5){
                System.out.println("Sum of founded number is: "+ sum);
                break;
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
