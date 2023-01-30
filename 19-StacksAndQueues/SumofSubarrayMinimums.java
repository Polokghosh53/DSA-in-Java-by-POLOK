// https://leetcode.com/problems/sum-of-subarray-minimums/
class Solution {    
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        
        Stack<Integer> stack = new Stack<>();
        long sumOfMinimums = 0;
        
        for (int i = 0; i <= arr.length; i++) {
            while (!stack.empty() && (i == arr.length || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int leftSide = stack.empty() ? -1 : stack.peek();
                int rightSide = i;
                
                // count the subarrays where mid is the minimum element
                long count = (mid - leftSide) * (rightSide - mid) % MOD;
                
                sumOfMinimums += (count * arr[mid]) % MOD;
                sumOfMinimums %= MOD;
            }
            stack.push(i);
        }
        return (int) (sumOfMinimums);
    }
}
