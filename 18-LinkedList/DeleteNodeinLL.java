// https://leetcode.com/problems/delete-node-in-a-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) { // Space & Time Complexity: O(1) since only one node is traversed and no extra space
        ListNode nextNode = node.next;
        
        node.val = nextNode.val;
        
        node.next = nextNode.next;
        
        nextNode.next = null;
    }
}
