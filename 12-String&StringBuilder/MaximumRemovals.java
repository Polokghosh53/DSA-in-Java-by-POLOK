package com.company;

public class MaximumRemovals {
    public int maximumRemovals(String s, String p, int[] removable) {
        if(s == null || s.length() == 0) return 0;
        char[] sChars = s.toCharArray();
        int start = 0;
        int end = removable.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            for (int i = 0; i <= mid ; i++) {
                // remove letters from 0 to mid by changing it into non letters
                sChars[removable[i]] = '?';
            }
            if(isSubsequence(sChars, p)){
                start = mid + 1;
            }
            else{
                for (int i = 0; i <= mid; i++) {
                    sChars[removable[i]] = s.charAt(removable[i]);
                }
                end = mid - 1;
            }
        }
        return start;
    }

    public boolean isSubsequence(char[] sChars, String p){
        int p1 = 0;
        int p2 = 0;
        while(p1 < sChars.length && p2 < p.length()){
            if(sChars[p1] != '?' && sChars[p1] == p.charAt(p2)){
                p2++;
            }
            p1++;
        }
        return p2 == p.length();
    }
}
