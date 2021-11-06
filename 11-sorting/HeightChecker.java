package com.company;

import java.util.Arrays;

class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }

        Arrays.sort(heights);

        int count = 0;
        for (int k = 0; k < heights.length; k++) {
            if(heights[k] != expected[k]){
                count++;
            }
        }
        return count;
    }
}