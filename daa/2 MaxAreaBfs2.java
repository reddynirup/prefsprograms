/*
Jadav Payeng, "The Forest Man of India", 
started planting the seeds in a M*N grid land.
Each cell in the grid land is planted with a seed.
After few days, some seeds grow into saplings indicates with '1',
and the rest are dead seeds indicates with '0'.

One or more saplings are connected either horizontally, vertically or 
diagonally with each other, form a sapling-group. 
There may be zero more sapling-groups in the grid land.

Jadav Payeng wants to know the biggest sapling-group in that grid land.

You are given the M * N grid, filled with 0's and 1's.
You are task is to help Jadav Payeng to find the number of saplings in 
the largest sapling-group.

Input Format:
-------------
Line-1: Two integers M and N, the number of rows and columns in the grid-land.
Next M lines: contains N space-separated integers .

Output Format:
--------------
Print an integer, the number of saplings in the 
largest sapling-group in the given grid-land.

Sample Input-1:
---------------
5 4
0 0 1 1
0 0 1 0
0 1 1 0
0 1 0 0
1 1 0 0

Sample Output-1:
----------------
8


Sample Input-2:
---------------
5 5
0 1 1 1 1
0 0 0 0 1
1 1 0 0 0
1 1 0 1 1
0 0 0 1 0

Sample Output-2:
----------------
5

*/

import java.util.*;

public class MaxArea_BFS 
{
    public static int solve(int[][] grid) 
	{
        if (grid == null || grid.length == 0) 
			return 0;
        int res = 0;
        int curr = 0;

        for (int i = 0; i < grid.length; i++)
		{
            for (int j = 0; j <grid[0].length; j++)
			{
                if (grid[i][j] == 1) 
				{
                    grid[i][j] = 0;
                    curr = bfs(grid, i, j);
                    res = Math.max(curr, res);
                }
            }
        }
        return res;
    }
    
    private static int bfs(int[][] grid, int k, int l)
	{
        int count=1;
        grid[k][l]=0;
        int adj[][]={{0,-1},{0,1},{-1,0},{1,0},{-1,1},{-1,-1},{1,-1},{1,1}};
        for(int[] pos:adj){
            int x=pos[0]+k;
            int y=pos[1]+l;
            if(x>=0 && x<grid.length && y>=0 && y<grid[0].length  && grid[x][y]==1){
                grid[x][y]=0;
                count+=bfs(grid,x,y);
            }
        }
        return count;
    }

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] board = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }
       System.out.println(new MaxArea_BFS().solve(board));
    }
}