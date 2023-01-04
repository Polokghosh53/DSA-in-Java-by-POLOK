// https://leetcode.com/problems/insertion-sort-list/
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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        
        while (curr != null) {
            // IMP: prev = dummy is instantiated everytime the node has to check the all previous nodes whether it is bigger or smaller than the curr node
            prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            // swap
            ListNode next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        
        return dummy.next;
    }
}
