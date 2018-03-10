package org.leetcode.Arrays;

public class LargestNumAtleastTwiceOfOthers {
    /*#747: idea is to find the second largest and the largest number
    if the largest number is >= second largest then it's twice all the other numbers
    */
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        int secondMax = 0;
        
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > max)
            {
                secondMax = max;
                max = nums[i];
                index = i;
            }
            else if(nums[i] > secondMax) secondMax = nums[i];
        }
        
        if(max < secondMax*2) return -1;
        
        return index;
    }
}
