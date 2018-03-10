package org.leetcode.Arrays;
import java.util.*;
public class DegreeOfAnArray {
	/*Step 1: the idea is to store the occurence of the elements from the array
    and store the index of the elements in a list.
    Step 2: find the shortest length of the subarray.
    */
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap();
        int maxDegree = 0;
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(map.get(nums[i]) == null)
                map.put(nums[i], new ArrayList<Integer>());
            map.get(nums[i]).add(i);
            maxDegree = Math.max(map.get(nums[i]).size(), maxDegree);
        }
        
        for(ArrayList<Integer> a : map.values())
        {
            if(maxDegree == a.size())
            {
                result = Math.min(result, (a.get(a.size()-1) - a.get(0)) + 1); //+1 for the length since index starts w/ 0
            }
        }
        
        return result;
    }
}
