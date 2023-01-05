// Variation of Clone list
// https://leetcode.com/problems/copy-list-with-random-pointer/
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        
        // creating deep copy of the original list
        Node c = head;
        while (c != null) {
            Node next = c.next;
            c.next = new Node(c.val);
            c.next.next = next;
            c = next;
        }
        
        // connect to random node until there is none left
        c = head;
        while (c != null) {
            if (c.random != null) {
                c.next.random = c.random.next;
            }
            c = c.next.next;
        }
        // restore the original list, and extract the copy list
        c = head;
        // head.next for returning the copy nodes
        Node copyHead = head.next;
        Node copy = copyHead;
        while (copy.next != null) {
            // connecting original list
            c.next = c.next.next;
            c = c.next;
            // connecting copy list
            copy.next = copy.next.next;
            copy = copy.next;
        }
        c.next = c.next.next;
        return copyHead;
    }
}
