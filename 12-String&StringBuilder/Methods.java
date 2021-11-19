package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Polok Ghosh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('o'));
        System.out.println("     Polok    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
