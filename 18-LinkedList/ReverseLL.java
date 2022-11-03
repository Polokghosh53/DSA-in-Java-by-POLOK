// https://leetcode.com/problems/reverse-linked-list/
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
//in place reversal of linked list
// iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }
}
