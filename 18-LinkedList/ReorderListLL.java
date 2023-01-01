// https://leetcode.com/problems/reorder-list/
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
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        
        ListNode slow = head;
        ListNode fast = head.next; // IMP
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = reverse(slow.next);
        slow.next = null;
        
        while (head != null && head2 != null) {
            ListNode temp = head.next;
            head.next = head2;
            
            head = head2;
            head2 = temp;
        }
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
