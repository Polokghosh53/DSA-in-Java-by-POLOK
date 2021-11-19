package com.company;

public class MaxRepeatingSubString {
    public int maxRepeating(String sequence, String word) {
        int ans = 0;
        StringBuilder str = new StringBuilder(word);
        while(sequence.contains(str.toString())){
            str.append(word);
            ans++;
        }
        return ans;
    }
}
