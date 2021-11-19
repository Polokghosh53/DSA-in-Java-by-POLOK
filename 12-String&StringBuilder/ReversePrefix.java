package com.company;

public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        int i = 0;
        while(i < word.length()){
            sb.append(word.charAt(i));
            if(word.charAt(i) == ch && !flag){
                sb.reverse();
                flag = true;
            }
        }
        return sb.toString();
    }
}
