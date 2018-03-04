package org.leetcode.Arrays;

public class RemoveDuplicateElement {
	 public int removeElement(int[] nums, int val) {
	        if(nums.length < 1) return 0;
	        int curr = 0;
	        
	        for(int i = 0; i < nums.length; i++)
	        {
	            if(nums[i] != val) nums[curr++] = nums[i];
	        }
	        
	        return curr;
	    }
}
