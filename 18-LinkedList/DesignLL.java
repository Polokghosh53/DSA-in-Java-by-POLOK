// https://leetcode.com/problems/design-linked-list/
class MyLinkedList {
    
    class Node {
        int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }
        
        Node currNode = this.head;
        while (index > 0) {
            currNode = currNode.next;
            index--;
        }
        return currNode.value;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.next = null;
            this.tail = node;
        }
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index == this.size) {
            addAtTail(val);
        } else {
            Node prevNode = getNodeAt(index - 1);
            Node node = new Node(val);
            Node nextNode = prevNode.next;
            prevNode.next = node;
            node.next = nextNode;
            this.size++;
        }
        
    }
    
    public Node getNodeAt(int index) {
        if (index < 0 || index >= this.size) {
            return null;
        }
        
        Node currNode = this.head;
        while (index > 0) {
            currNode = currNode.next;
            index--;
        }
        return currNode;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            return;
        }
        
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
            return;
        }
        if (index == 0) {
            Node currNode = this.head;
            Node newHead = currNode.next;
            currNode.next = null;
            this.head = newHead;
            this.size--;
        } else if(index == size - 1) {
            Node newTail = getNodeAt(this.size - 2);
            newTail.next = null;
            this.tail = newTail;
            this.size--;
        } else {
            Node prevNode = getNodeAt(index - 1);
            Node currNode = prevNode.next;
            Node nextNode = prevNode.next.next;
            prevNode.next = nextNode;
            currNode.next = null;
            this.size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
