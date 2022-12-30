// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) { // if only one node is present
            return null;
        }
        ListNode point1 = head;
        ListNode point2 = head;
        
        int count = 0;
        // getting count of the no of nodes
        while (point1 != null) {
            count += 1;
            point1 = point1.next;
        }
        
        // now traversing half - 1 of the total nodes
        for (int i = 0; i < (count/2) - 1; i++) {
            point2 = point2.next;
        }
        
        point2.next = point2.next.next;
        return head;
    }
}
