package com.company;

public class SB {
    public static void main(String[] args) {
        // Stringbuilder does not create new object and is mutable
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
