// https://leetcode.com/problems/unique-number-of-occurrences/
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1); // update the frequencies of the each number
        }

        Set<Integer> set = new HashSet<>();
        for (int x : freq.values()) {
            set.add(x); // add the frequencies of each number
        }
      // Check if the size of the freq map is equal to the size of the set. If they are equal, it means that the occurrences of frequencies are unique.
        return freq.size() == set.size(); 
    }
}
