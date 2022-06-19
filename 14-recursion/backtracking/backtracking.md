package com.company.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[r][c] == false) {
            return;
        }

        // I am considering this block in my path
        // This is done before the function call so that the when it enters the function call it will take that cell as a block
        // so that it does get revisited again.
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze,r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPath(p + 'L', maze, r, c - 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by the function
        maze[r][c] = true;
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (maze[r][c] == false) {
            return;
        }

        // I am considering this block in my path
        // This is done before the function call so that when it enters the function call it will take that cell as a block
        // so that it does get revisited again.
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze,r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by the function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}

package com.company.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("", 3, 3);
//        System.out.println(pathRetDiagonal("", 3, 3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestrictions("", board, 0, 0);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r - 1, c - 1));
        }

        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r, c - 1));
        }
        return list;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[r][c] == false) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze,r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}

package com.company.backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] board, int row, int col, int knights) {
       if (knights == 0) {
           display(board);
           System.out.println();
           return;
       }

       if (row == board.length - 1 && col == board.length) {
           return;
       }

       if (col == board.length) {
           knight(board, row + 1, 0, knights);
           return;
       }

       if (isSafe(board, row, col)) {
           board[row][col] = true;
           knight(board, row, col + 1, knights - 1);
           board[row][col] = false; // backtracking
       }
       knight(board, row, col + 1, knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    // whether the provided conditions are out of bound or not
    // do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

package com.company.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));

    }

    // since it is always starting row: 0, so it does not make sense to use column here
    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check the vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft ; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight ; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
