package org.leetcode.Arrays;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
        if(nums.length < 1) return 0;
        int curr = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] != nums[i])
            {
                nums[curr] = nums[i];
                curr++;
            }
        }
        return curr;
    }
}
