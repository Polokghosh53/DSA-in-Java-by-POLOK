// https://leetcode.com/problems/palindrome-linked-list/description/
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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;
        
        // compare both the halves
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);
        return head == null || headSecond == null;
    }
    
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}



// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
//         ListNode prev, temp;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         prev = slow;
//         slow = slow.next;
//         // prev.next = null, so that we break the reverse cycle and avoid an endless loop
//         prev.next = null;
//         while (slow != null) {
//             temp = slow.next;
//             slow.next = prev;
//             prev = slow;
//             slow = temp;
//         }

//         fast = head; // pointing back to head of LL
//         slow = prev; // slow pointing to end of LL
//         while (slow != null) {
//             if (fast.val != slow.val) {
//                 return false;
//             }
//             fast = fast.next;
//             slow = slow.next;
//         }
//         return true;
//     }
// }



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
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         List<Integer> ele = new ArrayList<>();

//         // convert LL into ArrayList
//         ListNode curr = head;
//         while (curr != null) {
//             ele.add(curr.val);
//             curr = curr.next;
//         }

//         // 2-pointer
//         int start = 0;
//         int end = ele.size() - 1;
//         while (start < end) {
//             if (!ele.get(start).equals(ele.get(end))) { // using !equals because this is Integer and not int
//                 return false;
//             }
//             start++;
//             end--;
//         }
//         return true;
//     }
// }
