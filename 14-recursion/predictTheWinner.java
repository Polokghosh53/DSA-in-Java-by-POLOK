// https://leetcode.com/problems/predict-the-winner/
class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return winner(nums, true, 0, 0, 0, nums.length - 1);
    }
    
    public boolean winner(int[] nums, boolean turn, int p1, int p2, int l, int r) {
        if (l == r) {
            // turn = true, meaning it is P1's turn
            if (turn) {
                p1 += nums[l];
            } else {
                p2 += nums[l];
            }
            return p1 >= p2;
        }
        
        if (turn) {
            // You can win by using left OR right
            return winner(nums, false, nums[l] + p1, p2, l + 1, r) || winner(nums, false, nums[r] + p1, p2, l, r- 1);
        }
        // For you to win, opponent needs to lose using both left AND right
        return winner(nums, true, p1, nums[l] + p2, l + 1, r) && winner(nums, true, p1, nums[r] + p2, l, r - 1);
    }
}
