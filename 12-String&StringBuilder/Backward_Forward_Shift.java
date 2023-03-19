/*
Consider one string as input. You have to check whether the strings obtained from the input string with single backward and single forward shift are the same or not. 
If they are the same, then print 1; otherwise print 0.
Hint:
Backward shift: A single circular rotation of the string in which the first character becomes the last character and all the other characters are shifted one index to the left. 
For example: "abcde" becomes "bcdea" after one backward shift.
Forward shift: A singular circular rotation of the string in which the last character becomes the first character and all the other characters are shifted to the right. 
For example: "abcde" becomes "eabcd" after one forward shift.
*/

import java.util.Scanner;

public class StringShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String backwardShifted = input.substring(1) + input.charAt(0);
        String forwardShifted = input.charAt(input.length()-1) + input.substring(0, input.length()-1);

        if (backwardShifted.equals(forwardShifted)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
