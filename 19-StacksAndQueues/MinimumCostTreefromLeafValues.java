// https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/
// TC: O(N) in one pass SC: O(N) for stack in worst case
class Solution {
    public int mctFromLeafValues(int[] arr) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        for (int a : arr) {
            while (stack.peek() <= a) {
                int mid = stack.pop();
                ans += mid * Math.min(stack.peek(), a);
            }
            stack.push(a);
        }
        while (stack.size() > 2) {
            ans += stack.pop() * stack.peek();
        }
        return ans;
    }
}
