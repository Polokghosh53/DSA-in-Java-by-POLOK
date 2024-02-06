// https://leetcode.com/problems/group-anagrams/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (!anagram.containsKey(key)) {
                anagram.put(key, new ArrayList<>(List.of(word)));
            } else {
                anagram.get(key).add(word);
            }
        }
        return new ArrayList<>(anagram.values());
    }
}
