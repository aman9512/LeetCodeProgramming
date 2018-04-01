package org.leetcode.Arrays;
import java.util.*;

public class ArrayPartI_561 {
	//use priorityQueue to get a sorted array
    public int arrayPairSum(int[] nums) {
       PriorityQueue<Integer> pq = new PriorityQueue();
       int min1 = 0;
       int sum = 0;
       for(int num : nums)
       {
           pq.add(num);
       }
        
       for(int i = 1; i <= nums.length; i++)
       {
           if(i%2 == 0)
           {
               sum += Math.min(min1, pq.poll());
           }
           else
           {
               min1 = pq.poll();
           }
       }
        
      return sum;
    }
}
