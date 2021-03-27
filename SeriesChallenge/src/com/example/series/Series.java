package com.example.series;

public class Series {
    public Series() {
    }

    //return sum of all numbers from 0 to n.
    public static long nSum(int n) {
        return (n * (n + 1)) / 2;
    }

    //return factorial off all numbers from 1 to n
    public static long factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //return fibonacci series
    public static int fibonacci(int n){
        int[] sums = new int[n + 1];
        int sum = 0;
        if(n < 2){
            return n;
        } else {
            sums[0] = 0;
            sums[1] = 1;
            for (int i = 2; i <= n ; i++) {
                sum += sums[i - 1];
                sum += sums[i - 2];
                sums[i] = sum;
                sum = 0;
            }
        }
        return sums[sums.length - 1];
    }
}
