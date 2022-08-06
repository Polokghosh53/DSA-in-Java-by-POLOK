// https://leetcode.com/problems/n-queens/
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = '.';
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        queens(0, board, ans);
        return ans;
    }
    
    public static void queens(int row, char[][] board, List<List<String>> ans) {
        if (row == board.length) {
            ans.add(construct(board));
            return;
        }
        
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col) == true) {
                board[row][col] = 'Q';
                queens(row + 1, board, ans);
                board[row][col] = '.';
            }
        }
    }
    
    public static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] i : board) {
            String s = new String(i);
            res.add(s);
        }
        return res;
    }
    
    private static boolean isSafe(char[][] board, int row, int col) {
        // check the vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft ; i++) {
            if(board[row-i][col-i] == 'Q') {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
