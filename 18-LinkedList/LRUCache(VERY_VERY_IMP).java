// https://leetcode.com/problems/lru-cache/
class LRUCache {

    private LinkedHashMap<Integer, Integer> map;
    private int SIZE;
    
    public LRUCache(int capacity) {
        map = new LinkedHashMap<>();
        SIZE = capacity;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            int value = map.remove(key);
            map.put(key, value);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
        }
        else if (map.size() + 1 > SIZE) {
            // If the number of keys exceeds the capacity from this operation, evict the least recently used key, which in thought has to be the first element in the map
            map.remove(map.keySet().iterator().next());
        }
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
