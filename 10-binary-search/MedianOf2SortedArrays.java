package com.company;
// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOf2SortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[nums1.length + nums2.length];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                ans[k++] = nums1[i++];
            }else{
                ans[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            ans[k++] = nums1[i++];
        }
        while(j < nums2.length){
            ans[k++] = nums2[j++];
        }

        double val = 0;
        if(ans.length % 2 == 0){
            val = (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2.0;
        }else{
            int mid = ans.length / 2;
            val = ans[mid];
        }
        return val;
    }
}
