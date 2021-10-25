package com.company;
// https://leetcode.com/problems/missing-number/
// Amazon Question
class MissingNumber {

    public int sort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        // case 2
        return arr.length;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
