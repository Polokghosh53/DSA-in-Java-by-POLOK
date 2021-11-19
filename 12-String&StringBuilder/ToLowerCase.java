package com.company;
// https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c + 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
