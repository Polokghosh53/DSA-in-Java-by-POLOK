package com.company;
// https://leetcode.com/problems/assign-cookies/
import java.util.Arrays;

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        
        int i = 0;
        int j = 0;
        int count = 0;
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}