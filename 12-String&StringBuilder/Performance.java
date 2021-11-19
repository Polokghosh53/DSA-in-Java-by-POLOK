package com.company;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;
            // here the string is immutable and hence creates a new string everytime a new char is added
            // hence a waste of memory space
        }
        System.out.println(series);
    }
}
