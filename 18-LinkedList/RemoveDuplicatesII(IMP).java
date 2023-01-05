// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode fakeNode = new ListNode(0, head);
        
        ListNode prev = fakeNode;
        
        while (head != null) {
            while (head.next != null && head.val == head.next.val) {
                // skip all duplicates
                head = head.next;
            }
            if (prev.next == head) {
                prev = prev.next; // head.val is distinct, move pre to next node
            } else {
                prev.next = head.next; // skip duplicates, but prev shouldn't move now
            }
            head = head.next;
        }
        return fakeNode.next;
    }
  // RECURSIVE
  public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        
        if (head.val != head.next.val) {
            head.next = deleteDuplicates(head.next);
            return head;
        } else {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        }
    }
}
