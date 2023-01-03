// https://leetcode.com/problems/remove-nodes-from-linked-list/
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
    public ListNode removeNodes(ListNode head) {
        if (head == null) return head;
        // RECURSION Space & Time Complexity: O(N)
        head.next = removeNodes(head.next);
        return head.next != null && head.val < head.next.val ? head.next : head;
    }
  
  // ITERATIVE
  public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        
        while (curr.next != null) {
            if (curr.next.val >= curr.val) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }
        }
        return reverse(head);
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
