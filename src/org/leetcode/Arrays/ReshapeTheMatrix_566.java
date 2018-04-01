package org.leetcode.Arrays;

public class ReshapeTheMatrix_566 {
	  //really liked this idea from discuss page to use division for getting row #
	 //and using mod for column number
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int origR = nums.length;
        int origC = nums[0].length;
        
        if( r * c > origR * origC )return nums;
        int[][] newNums = new int[r][c];
        int index = 0;
        
        for(int i = 0; i < origR; i++)
        {
            for(int j = 0; j < origC; j++)
            {
                newNums[index/c][index%c] = nums[i][j];
                index++;
            }
        }
        
        return newNums;
    }
}
