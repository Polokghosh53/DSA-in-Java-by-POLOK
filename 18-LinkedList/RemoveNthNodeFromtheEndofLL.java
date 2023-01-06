// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode startNode = dummy;
        ListNode endNode = dummy;
        
        // since difference b/w startNode and endNode should be n
        // so that we can find the node in b/w and skip that particular node 
        while (n > 0) {
            endNode = endNode.next;
            n--;
        }
        
        while (endNode.next != null) {
            startNode = startNode.next;
            endNode = endNode.next;
        }
        
        startNode.next = startNode.next.next;
        return dummy.next;
    }
}
