package org.leetcode.Arrays;
//#35 leetcode

public class SearchElementSortedArray {
	public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }
    
    public int binarySearch(int[] nums, int target, int start, int end)
    {
        if(start <= end)
        {
            int mid = (end+start)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                return binarySearch(nums, target, start, mid-1);
            if(nums[mid] < target)
                return binarySearch(nums, target, mid+1, end);
        }
        return start; //if we didn't find the target
    }
}
