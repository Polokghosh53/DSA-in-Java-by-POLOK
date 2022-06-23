// https://leetcode.com/problems/word-search/

class Solution {
    
    // publically available to all classes
    boolean visited[][]; // so that we do not revisit the same cell during the recursion call
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int columns = board[0].length;
        
        visited = new boolean[rows][columns];
        
        // traversing for rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                
                // for example, while traversing if we find the first char of the word, thats 'A' in "ABCCED"
                // from there we start the finding the next characters of the word
                // if we find the all characters matching with the word after the recursion calls return, return true
                if (word.charAt(0) == board[i][j] && wordSearch(i, j, 0, word, board)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean wordSearch(int i, int j, int index, String word, char[][] board) {
        if (index == word.length()) {
            return true;
        }
        
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || visited[i][j] || word.charAt(index) != board[i][j]) {
            return false;
        }
        
        visited[i][j] = true;
        
        // recursive search for next char in the word, up, down, left and right
        if (wordSearch(i + 1, j, index + 1, word, board) ||
            wordSearch(i - 1, j, index + 1, word, board) ||
            wordSearch(i, j + 1, index + 1, word, board) ||
            wordSearch(i, j - 1, index + 1, word, board)) {
            return true;
        }
        
        visited[i][j] = false;
        return false;
    }
    
}
