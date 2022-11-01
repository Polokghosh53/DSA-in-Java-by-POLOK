// https://leetcode.com/problems/happy-number/
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
          // imagine this as a cycle in a Linked list
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        return slow == 1;
    }
    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }
        return ans;
    }
}
