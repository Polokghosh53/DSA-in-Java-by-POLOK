package com.company;

public class Comparison {
    public static void main(String[] args) {
        String a = "Polok";
        String b = "Polok";

        // ==
        System.out.println(a == b); // in the pool of heap

        String name1 = new String("Polok");
        String name2 = new String("Polok");

        System.out.println(name1 == name2); // in the heap

        System.out.println(name1.equals(name2)); // will give true

        System.out.println(name1.charAt(0));
    }
}
