package org.leetcode.Arrays;
import java.util.*;

public class KDiff_532 {
	public int findPairs(int[] nums, int k) {
        if(k < 0) return 0; //absolute difference must be k so k must be positive
        HashMap<Integer, Integer> map = new HashMap();
        int result = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
          map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); //adding 1 for case k = 0; we must've more than twice of the same 
                                                             //number for k = 0.
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(k == 0)
            {
                if(entry.getValue() > 1) result++;
            }
            else
            {
                int diff = entry.getKey() - k; //this will make sure you've unique pairs because i - k = j && j - k != i
                                                //for ex: [3,1] k = 2 so 3 - 2 = 1 but 1 - 2 != 3. so output is 1
                if(map.containsKey(diff))
                {
                    result++;
                }
            }
        }
        return result;
    }
}
