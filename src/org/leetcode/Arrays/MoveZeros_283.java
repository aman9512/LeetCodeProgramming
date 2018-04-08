package org.leetcode.Arrays;

public class MoveZeros_283 {
	   public void moveZeroes(int[] nums) {
	        //idea is to move all the non-zero elements to the beginning and then add 0's.
	        int currentIndex = 0;
	        for(int i = 0; i < nums.length; i++)
	            if(nums[i] != 0) nums[currentIndex++] = nums[i];
	        while(currentIndex < nums.length)
	            nums[currentIndex++] = 0;
	    }
}
