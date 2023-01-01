public class LL {
   private Node head;
   private Node tail;
   private int size;
   public LL() {
       this.size = 0;
   }
  
  private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
  
  // RECURSIVE
  private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        // the following is done: 4->3->2->1
        reverse(node.next);
        // pointing 1 as tail and proceeding in reverse
        // tail which is 1 then 1->2->3->4
        tail.next = node;
        tail = node;
        tail.next = null;
    }
  
  // ITERATIVE
  public void reverse(Node node) {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }
}
