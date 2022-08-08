// https://leetcode.com/problems/n-queens-ii/
class Solution {
    public int count = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = '.';
            }
        }
        queens(0, board, n);
        return count;
    }
    
    public void queens(int row, char[][] board, int n) {
        if (row == n) {
            count++;
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (isSafe(n, board, row, col)) {
                board[row][col] = 'Q';
                queens(row + 1, board, n);
                board[row][col] = '.';
            } 
        }
    }
    
    public static boolean isSafe(int n, char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i] == 'Q') {
                return false;
            }
        }
        
        int maxRight = Math.min(row, n - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i] == 'Q') {
                return false;
            }
        }
        return true;
    }
    
}
