// https://leetcode.com/problems/number-of-1-bits/
// The input must be a binary string of length 32
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int match = 1;
        int count = 0;
        for(int i = 31; i >= 0; i--){
            if((n & match) != 0){
                count++;
            }
            match <<= 1;
        }
        return count;
    }
}
