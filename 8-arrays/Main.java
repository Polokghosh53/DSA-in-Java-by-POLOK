package com.company;

public class Main {

    public static void main(String[] args) {
	    // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers;
        // int[] rnos = new int[5];
        // or directly
        // int[] rnos2 = {23, 12, 45, 32, 15};


        int[] rnos; // declaration of array. rno is getting defined in the stack
        rnos = new int[5]; // initialisation: actually object is being created in the heap

        System.out.println(rnos[1]);


        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}
