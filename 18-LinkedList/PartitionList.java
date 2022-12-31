// https://leetcode.com/problems/partition-list/solution/
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
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        
        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0);
        ListNode after = afterHead;
        
        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        
        // since nodes > x will be in the end and has to end with null
        // Last node of "after" list would also be ending node of the reformed list
        after.next = null;
        
        // connecting the nodes after the 0 node of after with the end node of before
        before.next = afterHead.next;
        
        // returning the head after the 0 node
        return beforeHead.next;
    }
}
