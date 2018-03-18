package org.leetcode.Arrays;

//695
//Idea is to use dfs for finding the adjacent islands
//mark the grid w/ 0 for visited to avoid having cycles
public class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                int currentResult = dfsHelper(grid, i, j, row, col);
                result = Math.max(result, currentResult);
            }
        }
        
        return result;
    }
    
    int dfsHelper(int[][] grid, int i, int j, int row, int col)
    {
        if(i < 0 || j >= col || i >= row || j < 0 || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return 1 + dfsHelper(grid, i+1, j, row, col) + dfsHelper(grid, i-1, j, row, col) + dfsHelper(grid, i, j+1, row, col) + dfsHelper(grid, i, j-1, row, col);
    }
}
