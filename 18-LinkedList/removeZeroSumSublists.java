// https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        // create dummy node
        ListNode front = new ListNode(0, head);
        // start to end node to check which nodes consecutively needs to be removed
        ListNode start = front;

        while (start != null) {
            // take a prefixSum to calculate when the prefixSum calculates to zero
            // then where the end sums zero put start.next = end.next
            int prefixSum = 0;
            ListNode end = start.next;
            while (end != null) {
                prefixSum += end.val;

                if (prefixSum == 0) {
                    start.next = end.next;
                }
                end = end.next;
            }
            start = start.next;
        }
        // return values after dummy node
        return front.next;
    }
}
