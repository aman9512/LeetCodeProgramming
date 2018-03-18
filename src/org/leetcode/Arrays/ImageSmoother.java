package org.leetcode.Arrays;

//661
public class ImageSmoother {
	public int[][] imageSmoother(int[][] M) {
        int row = M.length;
        int col = M[0].length;
        int[][] result = new int[row][col];
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                result[i][j] = smoothCell(M, i, j, row, col);
            }
        }
        
        return result;
    }
    
    //total of 8 combinations or less
    /*
        (i-1,j), (i+1,j), (i, j+1), (i, j-1), (i-1, j-1)
        (i, j), (i-1, j+1), (i+1, j+1)
    */
    boolean isValid(int i, int j, int row, int col)
    {
        if(i < 0 || j < 0 || j >= col || i >= row) return false;
        return true;
    }
    int smoothCell(int[][] M, int i, int j, int row, int col)
    {
        int total = 0; 
        int sum   = 0;
        
        //for i (+1,0,-1) and same for j
       for(int x = -1; x < 2; x++)
       {
           for(int y = -1; y < 2; y++)
           {
               if(!(isValid(i+x, j+y, row, col))) continue; //bound checking
               total++;
               sum += M[i+x][j+y];
           }
       }
        
        return sum/total;
    }
}
