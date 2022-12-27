// https://leetcode.com/problems/remove-linked-list-elements/
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
    // ITERATIVE
    public ListNode removeElements(ListNode head, int val) {
        // using dummy node for null head checking
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
  
  // RECURSIVE
  public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
