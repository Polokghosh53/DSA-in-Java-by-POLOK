// https://leetcode.com/problems/sort-list/
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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head, fast = head, pre = head;
        while (fast != null && fast.next != null) {
            // due to pre.next = null; the original list is severed in half
            // the list rooted at head only goes from head -> pre & merged from the list from slow -> fast
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return merge(sortList(head), sortList(slow));
    }

    ListNode merge(ListNode list1, ListNode list2) {
        // listNode head for indicating the position of the node in the LL for returning the head
        ListNode head = new ListNode(0);

        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            head = list2;
            list2 = list2.next;
        }else {
            head = list1;
            list1 = list1.next;
        }

        head.next = merge(list1, list2);
        return head;
    }
}
