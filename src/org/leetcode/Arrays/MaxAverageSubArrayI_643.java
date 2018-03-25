package org.leetcode.Arrays;

//sliding window method
public class MaxAverageSubArrayI_643 {
	 public double findMaxAverage(int[] nums, int k) {
	        int maxSum = Integer.MIN_VALUE;
	        int currentSum = 0;
	        int index = 0;
	        
	        //sum from i to k
	        for(int i = 0; i < k; i++)
	        {
	            currentSum += nums[i];
	        }
	        
	        maxSum = currentSum;
	        for(int i = k; i < nums.length; i++)
	        {
	            currentSum = currentSum + nums[i] - nums[index++];
	            maxSum = Math.max(maxSum, currentSum);
	        }
	        
	        return maxSum/(double)k;
	    }
}
