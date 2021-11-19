package com.company;
// https://leetcode.com/problems/number-of-ways-to-split-a-string/
public class SplitString {
    public int numWays(String s) {
        long l = s.length();
        long one = 0;
        long mod = 1_000_000_007;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            //there will be 3 cases
            // 1.no ones present in the string
            // 2.number of ones present in the string is not divisible by 3(since we need to cut 3 parts)
            // 3.number of ones divisible by 3
            if (ch[i] == '1') {
                one++;
            }
        }
        if (one == 0) {
            return (int) ((l - 1) * (l - 2) / 2 % mod);
        }
        if (one % 3 != 0) {
            return 0;
        }
        long ones = one / 3;
        one = 0;
        long part1 = 0;
        long part2 = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                one++;
            }
            if (one == ones) {
                part1++;
            }
            if (one == 2 * ones) {
                part2++;
            }
        }
        return (int) ((part1 * part2) % mod);
    }
}