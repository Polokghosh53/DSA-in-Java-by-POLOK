package com.company;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3)); // a + b-c-d where d = 100

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Polok" + new ArrayList<>());
        System.out.println("Polok" + new Integer(56));

        // Very important part to note. String works with Primitive types and complex methods only if one the type is String
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
