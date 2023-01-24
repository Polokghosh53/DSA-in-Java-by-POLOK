// https://leetcode.com/problems/find-the-most-competitive-subsequence/
class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        // TC: O(N)
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[k];
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && stack.peek() > nums[i] && stack.size() - 1 + nums.length - i >= k) {
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }
        int i = k - 1;
        while (!stack.isEmpty()) {
            result[i--] = stack.pop(); // SC: O(k)
        }
        return result;
    }
}
