// https://leetcode.com/problems/product-of-array-except-self/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        int left = 1, right = 1;
        
        for(int j = nums.length - 1; j >= 0; j--){
            ans[j] = right;
            right *= nums[j];
        }
        
        for(int i = 0; i < nums.length; i++){
            ans[i] *= left;
            left *= nums[i];
        }
        
        return ans;
    }
}
