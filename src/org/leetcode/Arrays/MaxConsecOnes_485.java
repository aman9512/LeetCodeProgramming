package org.leetcode.Arrays;

public class MaxConsecOnes_485 {
	public int findMaxConsecutiveOnes(int[] nums) {
        int currentMax = 0;
        int maxConsec = 0;
        
        for(int i : nums)
        {
            currentMax += i;
            if(i == 0)
            {
                maxConsec = Math.max(maxConsec, currentMax);
                currentMax = 0;
            }
        }
        
        return Math.max(maxConsec, currentMax);
    }
}
