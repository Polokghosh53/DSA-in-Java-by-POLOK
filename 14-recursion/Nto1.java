package com.company;

public class Nto1 {
    public static void main(String[] args) {
        funBoth(5);
    }

    static void func(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        func(n - 1);
    }
    static void funRev(int n){
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }
}
