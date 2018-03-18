package org.leetcode.Arrays;

//665
public class NondecreasingArray {
	public boolean checkPossibility(int[] nums) {
        /*
            example: [4,2,3] here we change the prev value so modified will be [2,2,3]
            [3,4,2,3] here if we change the prev value when i = 2 then this will return true
            so instead we change the current value because it's lower than nums[i-2] so 2 < 3 so modified will be
            [3,4,4,3] this will return the correct result which is false
        */
        boolean found = false;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < nums[i-1])
            {
                if(found) return false;
                found = true;
                if(i-2 >= 0 && nums[i] < nums[i-2])  nums[i] = nums[i-1]; //change the current value if it's less than two prev values
                else nums[i-1] = nums[i]; //change the prev value if the prev value is greater than the current
            }
        }
        return true;
    }
}
