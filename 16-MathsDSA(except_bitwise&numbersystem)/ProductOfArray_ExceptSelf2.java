// https://leetcode.com/problems/product-of-array-except-self/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 1;
        for(int i = 0; i < n; i++){
            if(i > 0){
                left = left * nums[i - 1];
            }
            ans[i] = left;
        }
        
        int right = 1;
        for(int i = n - 1; i >= 0; i--){
            if(i < n - 1){
                right = right * nums[i + 1];
            }
            ans[i] *= right;
        }
        return ans;
    }
}
