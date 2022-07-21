// https://leetcode.com/problems/beautiful-arrangement/
class Solution {
    int count = 0;
    public int countArrangement(int n) {
        boolean[] visited = new boolean[n + 1];
        backtrack(n, 1, visited);
        return count;
    }
    
    public void backtrack(int N, int pos, boolean[] visited) {
        if (pos > N) {
            count++;
        }
        
        for (int i = 1; i <= N; i++) {
             if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                backtrack(N, pos + 1, visited);
                visited[i] = false;
            }
        }
    }
}
