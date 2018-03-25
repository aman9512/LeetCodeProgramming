package org.leetcode.Arrays;

public class ShortestUnsortedContSubArray_581 {
	/*
    The idea from discuss page:
    1. Find the min value and max value that are not in their correct position
    2. Find the position of where min and max Value should be placed.
    Time complexity/space complexity: O(N) / O(1)
*/
public int findUnsortedSubarray(int[] nums) {
    int minValue = Integer.MAX_VALUE;
    int maxValue = Integer.MIN_VALUE;
    int len = nums.length;
    int start = Integer.MAX_VALUE;
    int end = 0;

    //find the minValue that's not in its correct position
    for(int i = 1; i < len; i++)
    {
        if(nums[i] < nums[i-1])
        {
            minValue = Math.min(minValue, nums[i]);
        }
    }
    
    //  //find the maxValue that's not in its correct position
    for(int i = len-1; i > 0; i--)
    {
        if(nums[i] < nums[i-1])
        {
            maxValue = Math.max(maxValue, nums[i-1]);
        }
    }
    
    //find the position where minValue should be placed
    for(int i = 0; i < len; i++)
    {
        if(minValue < nums[i])
        {
            start = i;
            break;
        }
    }
    
    //find the position where maxValue should be placed
    for(int i = len-1; i >= 0; i--)
    {
        if(maxValue > nums[i])
        {
            end = i;
            break;
        }
    }
    
    return start < end ? (end - start) + 1 : 0;
}
}
