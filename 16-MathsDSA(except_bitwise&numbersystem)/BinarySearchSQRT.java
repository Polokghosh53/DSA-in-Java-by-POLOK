package com.company;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.printf("%.3f", sqrt(n, p));
    }
    // TC: O(log(n))
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;
        // finding integer value of root
        while(s <= e) {
            int mid = s + (e - s) / 2;

            if(mid * mid == n){
                return mid;
            }

            if(mid * mid > n){
                e = mid - 1;
            } else{
                s = mid + 1;    
            }
        }
        // finding decimal value of root
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10; // for next decimal iteration
        }

        return root;
    }
}
