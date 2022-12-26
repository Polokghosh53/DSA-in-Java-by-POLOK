// https://leetcode.com/problems/linked-list-components/
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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int count = 0;
        
        while (head != null) {
            boolean found = false;
            while (head != null && set.contains(head.val)) {
                found = true;
                head = head.next;
            }
            // count head for each connected component
            if (found) {
                count++;
            }
            if (head != null) {
                head = head.next;
            }
        }
        return count;
    }
}
