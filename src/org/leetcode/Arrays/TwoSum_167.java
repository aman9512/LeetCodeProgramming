package org.leetcode.Arrays;

public class TwoSum_167 {
	  public int[] twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	        int start = 0;
	        int end = nums.length-1;
	        while(start < end)
	        {
	            int currentSum = nums[start] + nums[end];
	            if(currentSum == target) 
	            {
	                result[0] = start+1;
	                result[1] = end+1;
	                break;
	            }else if(currentSum > target) end--;
	            else start++;
	        }
	        return result;
	    }
}
