// https://leetcode.com/problems/design-hashset/
// LINKED LIST METHOD - 13ms
class Node {
    public int val;
    public Node next;
    
    public Node(int val) {
        this.val = val;
    }
}

class MyHashSet {
    
    private static final int size = 10000;
    
    Node[] hashSet = new Node[size];

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        Node pointer = hashSet[key % size];
        if (pointer == null) {
            hashSet[key % size] = new Node(key);
        } else {
            Node curr = pointer;
            Node prev = curr;
            while (curr != null) {
                if (curr.val == key) return;
                prev = curr;
                curr = curr.next;
            }
            prev.next = new Node(key);
        }
    }
    
    public void remove(int key) {
        Node curr = hashSet[key % size];
        
        while (curr != null) {
            if (curr.val == key) {
                curr.val = -1;
                return;
            }
            curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        Node curr = hashSet[key % size];
        while (curr != null) {
            if (curr.val == key) return true;
            curr = curr.next;
        }
        return false;
    }
}

// ARRAY METHOD - 28 ms
class MyHashSet {
    
    int[] arr;

    public MyHashSet() {
        arr = new int[1000001];
    }
    
    public void add(int key) {
        arr[key] = 1;
    }
    
    public void remove(int key) {
        arr[key] = 0;
    }
    
    public boolean contains(int key) {
        if (arr[key] == 0) return false;
        else return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
