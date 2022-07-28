// Search GFG Rat In A Maze
public class Main
{
    
    static int N;
	public static void main(String[] args) {
		int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        N = maze.length;
        solveMaze(maze);
	}
	
	public static void printSolution(int sol[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(
                    " " + sol[i][j] + " ");
            System.out.println();
        }
    }
	
	public static boolean isSafe(int maze[][], int x, int y) {
	    return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
	}
	
	public static boolean solveMaze(int maze[][]) {
	    int sol[][] = new int[N][N];
	    
	    if (solveMazeUtil(maze, 0, 0, sol) == false) {
	        return false;
	    }
	    printSolution(sol);
	    return true;
	}
	
	public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
	    if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
	        sol[x][y] = 1;
	        return true;
	    }
	    
	    if(isSafe(maze, x, y) == true) {
	        if (sol[x][y] == 1) {
	            return false;
	        }
	        
        // mark that x,y as a path as 1 if it is the path taken
	        sol[x][y] = 1;
	        
	        if (solveMazeUtil(maze, x + 1, y, sol)) {
	            return true;
	        }
	        
	        if (solveMazeUtil(maze, x, y + 1, sol)) {
	            return true;
	        }
        
        // for backtracking
        // if path has not been found
	        sol[x][y] = 0;
	        return false;
	    }
	    return false;
	}
}
