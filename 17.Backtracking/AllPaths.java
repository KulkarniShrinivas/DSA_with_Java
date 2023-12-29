package Backtracking;


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
            }

            if (!maze[r][c]) {
                return;
            }
            //I am consiidering this block in my path
            //backtraking
            maze[r][c] = false;


            if (r < maze.length - 1) {
                allPath(p + 'D', maze, r + 1, c);
            }

            if (c < maze[0].length - 1) {
                allPath(p + 'R', maze, r, c + 1);
            }

            if (c > 0) {
                allPath(p + 'U', maze, r - 1, c);
            }
            if (c > 0) {
                allPath(p + 'L', maze, r, c - 1);
            }

            ///this line is where the function will be over
            // so before the function gets removed, also remove the changes that were made by that function
            //this is backtracking
            maze[r][c] = true;
        }


    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        int rows = maze.length;
        int cols = maze[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols || !maze[r][c]) {
            return;
        }

        if (r == rows - 1 && c == cols - 1) {
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        // I am considering this block in my path
        // backtracking
        maze[r][c] = false;

        path[r][c] = step;

        // Move down
        allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        // Move right
        allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        // Move up
        allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        // Move left
        allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);

        // Backtrack: restore the state
        maze[r][c] = true;
        path[r][c] = 0;
    }

}




