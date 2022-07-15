// https://leetcode.com/problems/letter-tile-possibilities/
class Solution {
    // simple backtracking approach
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] vis = new boolean[tiles.length()];
        backtrack(tiles, "", set, vis);
        return set.size() - 1; // -1 is given in order to not consider 'null' string as countline gdb
    }
    /* The idea is to add characters one by one of the input string (tiles) to a temporary
     string which is further added to a HashSet to avoid repeatation. 
    While doing so the characters which are once visited should be skipped for that 
    maintain a `visited` array of size same as that of the entire string.
    */
    
    public void backtrack(String tiles, String curr, Set<String> set, boolean[] vis) {
        set.add(curr);
        for (int i = 0; i < tiles.length(); i++) {
            //
            if(!vis[i]) {
                vis[i] = true;
                backtrack(tiles, curr + tiles.charAt(i), set, vis);
                vis[i] = false;
            }
        }
    }
}
