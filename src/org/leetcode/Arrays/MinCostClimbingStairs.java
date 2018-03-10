package org.leetcode.Arrays;

public class MinCostClimbingStairs {
	   public int minCostClimbingStairs(int[] cost) {
	        int n = cost.length;
	        int[] buffer = new int[n];
	        buffer[0] = cost[0];
	        buffer[1] = cost[1];
	        
	        for(int i = 2; i < n; i++)
	        {
	            //climb 1 or 2 steps so find the min between climbing 1 step vs 2 steps
	        	//and add the current cost of the i-th step
	            buffer[i] = cost[i] + Math.min(buffer[i-1], buffer[i-2]);
	        }
	        
	        //we can start with index 0 or index 1
	        return Math.min(buffer[n-1], buffer[n-2]);
	    }
}
