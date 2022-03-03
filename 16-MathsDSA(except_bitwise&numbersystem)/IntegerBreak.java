// https://leetcode.com/problems/integer-break/
// Given an integer n, break it into the sum of k positive integers, where k >= 2, 
// and maximize the product of those integers.
// Return the maximum product you can get.

// TC: O(log(n)), when Math.pow is used.
// The factors of (2, 3) are used in order to maximize the product value.
class Solution {
    public int integerBreak(int n) {
        if(n == 2){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else if(n % 3 == 0){
            return (int)Math.pow(3, n/3);
        }
        else if(n % 3 == 1){
            return 2 * 2 * (int)Math.pow(3, (n - 4) / 3);
        }
        else{
            return 2 * (int)Math.pow(3, n /3);
        }
    }
}
