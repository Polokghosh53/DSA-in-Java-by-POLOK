package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){
        // just for demo, use long instead
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibonacci(int n){

        // base condition
        if (n < 2){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
