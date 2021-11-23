package com.company;
// https://leetcode.com/problems/search-a-2d-matrix/
public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int flag = 0;
        int cStart = 0;
        int cEnd = col - 1;
        int rStart = 0;
        int rEnd = row - 1;
        while(rStart <= rEnd){
            int rMid = rStart + (rEnd - rStart) / 2;
            if(target < matrix[rMid][cStart]){
                rEnd = rMid - 1;
            } else if(target > matrix[rMid][cEnd]){
                rStart = rMid + 1;
            }
            else{
                while(cStart <= cEnd){
                    int cMid = cStart + (cEnd - cStart) / 2;
                    if(target == matrix[rMid][cMid]){
                        flag = 1;
                        break;
                    } else if(target < matrix[rMid][cMid]){
                        cEnd = cMid - 1;
                    }
                    else{
                        cStart = cMid + 1;
                    }
                }
                break;
            }
        }
        if(flag == 0){
            return false;
        }
        return true;
    }
}
