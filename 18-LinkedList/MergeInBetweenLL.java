// https://leetcode.com/problems/merge-in-between-linked-lists/
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // left node just before a  
        ListNode left = list1;
        for (int i = 1; i < a; i++) {
            left = left.next;
        }
        // middle node on b, so that middle.next will be the connected list2
        ListNode middle = left;
        for (int i = a; i <= b; i++) {
            middle = middle.next;
        }
        
        // connected list1 before a to list2 start
        left.next = list2;
        
        // traverse just before null of list2, hence list2.next to avoid null
        while (list2.next != null) {
            list2 = list2.next;
        }
        // connect with list2 end with next of middle node
        list2.next = middle.next;
        return list1;
    }
}
