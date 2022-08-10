// https://leetcode.com/problems/unique-paths-iii/
class Solution {
    int count = 0;
    public int uniquePathsIII(int[][] grid) {
        int zeros = 1;
        int m = grid.length;
        int n = grid[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    zeros++;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, zeros);
                }
            }
        }
        return count;
    }
    
    public void dfs(int[][] grid, int i, int j, int zeros) {
        // base condition
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1 || grid[i][j] == -2) {
            return;
        }
        
        if(grid[i][j] == 2 && zeros == 0){
            count++;
            return;
        }
        
        if (grid[i][j] == 2) {
            return;
        }
        
        grid[i][j] = -2;
        dfs(grid, i - 1, j, zeros - 1);
        dfs(grid, i + 1, j, zeros - 1);
        dfs(grid, i, j - 1, zeros - 1);
        dfs(grid, i, j + 1, zeros - 1);
        grid[i][j] = 0;
    }
}
