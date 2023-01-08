// https://leetcode.com/problems/merge-k-sorted-lists/
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
    // Merge Divide and Conquer - O(kN)
    public ListNode mergeKLists(ListNode[] lists) {
         if (lists == null || lists.length == 0) {
             return null;
         }
        return divideAndConquer(lists, 0, lists.length - 1);
    }
    
    private ListNode divideAndConquer(ListNode[] lists, int low, int high) {
        if (low > high) { // which is invalid
            return null;
        }
        
        if (low == high) { // that is 1
            return lists[low];
        }
        
        int mid = low + (high - low) / 2;
        ListNode left = divideAndConquer(lists, low, mid);
        ListNode right = divideAndConquer(lists, mid + 1, high);
        return mergeList(left, right);
    }
    
    private ListNode mergeList(ListNode n1, ListNode n2) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n1 != null && n2 != null) {
            if (n1.val < n2.val) {
                prev.next = n1;
                n1 = n1.next;
            } else {
                prev.next = n2;
                n2 = n2.next;
            }
            prev = prev.next;
        }
        prev.next = (n1 != null) ? n1 : n2;
        return dummy.next;
    }
}
