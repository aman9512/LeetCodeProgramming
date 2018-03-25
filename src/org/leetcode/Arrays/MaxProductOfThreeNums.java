package org.leetcode.Arrays;

//628
public class MaxProductOfThreeNums {
	//there are 2 cases where we can get our max product
    //case 1: find 2 min values and 1 largest value because of negatives
    //case 2: find 3 largest values
    //return max of case 1 and 2
    public int maximumProduct(int[] nums) {
        int minValue1 = Integer.MAX_VALUE;
        int minValue2 = Integer.MAX_VALUE;
        int maxValue1 = Integer.MIN_VALUE;
        int maxValue2 = Integer.MIN_VALUE;
        int maxValue3 = Integer.MIN_VALUE;
        
        //for min value1 < value2 
        //for max value1 > value2 > value3
        for(int i = 0; i < nums.length; i++)
        {
            int currentValue = nums[i];
            if(currentValue < minValue1)
            {
                minValue2 = minValue1;
                minValue1 = currentValue;
            }
            else
            {
                if(currentValue < minValue2) minValue2 = currentValue;
            }
            
            if(currentValue > maxValue1)
            {
                maxValue3 = maxValue2;
                maxValue2 = maxValue1;
                maxValue1 = currentValue;
            }
            else if(currentValue > maxValue2)
            {
                maxValue3 = maxValue2;
                maxValue2 = currentValue;
            }
            else
            {
                if(currentValue > maxValue3) maxValue3 = currentValue;
            }
        }
        
        return Math.max((minValue1*minValue2*maxValue1),(maxValue1*maxValue2*maxValue3));
        
    }
}
