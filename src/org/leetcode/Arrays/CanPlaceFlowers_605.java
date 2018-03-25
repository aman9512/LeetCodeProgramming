package org.leetcode.Arrays;

//idea is to find the empty position (0 element) and check for it's adjacent empty positions
public class CanPlaceFlowers_605 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int planted = n;
        int i = 0;
        
        while(i < flowerbed.length)
        {
            if(flowerbed[i] == 0)
            {
                if((i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0))
                {
                      flowerbed[i] = 1;
                      planted--;
                      i++;
                }
            }
            
            if(planted == 0) return true;
            
            i++;
        }
        
        return planted <= 0;
    }
}
