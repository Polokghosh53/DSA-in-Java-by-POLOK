// https://leetcode.com/problems/target-sum/
// TC: O(2^n) for recursion tree size
// SC: O(n) for depth of the recursion tree

class Solution {
    
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        calculate(nums, target, 0, 0);
        return count;
    }
    
    public void calculate(int[] nums, int target, int i, int sum) {
        if (i == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            calculate(nums, target, i + 1, sum + nums[i]);
            calculate(nums, target, i + 1, sum - nums[i]);
        }
    }
}
