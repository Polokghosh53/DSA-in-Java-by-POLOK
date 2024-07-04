// https://leetcode.com/problems/merge-nodes-in-between-zeros/
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
    public ListNode mergeNodes(ListNode head) {
        // start with first non-zero value
        head = head.next;
        if (head == null) {
            return head;
        }

        // dummy node
        ListNode temp = head;
        int sum = 0;
        while (temp.val != 0) {
            sum += temp.val;
            temp = temp.next;
        }

        // store sum value in head
        head.val = sum;
        // store head's next node as the recursive result for temp node
        // as temp reaches next 0
        head.next = mergeNodes(temp);
        return head;
    }
}
