package com.company;

public class floor {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    // return the index : greatest number <= target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
//           int mid = (start + end) / 2; // might be possible that (start+end) exceeds the range of int in Java
            int mid = start + (end - start) / 2; // same as above but better way

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }
}
