package org.leetcode.Arrays;

public class OneBitAndTwoBitsCharacters {
	   /*idea is to traverse right to left 
    you traverse until you've met a zero excluding the last zero
     by the time you meet another zero you must have met even number of 1's. checking for valid pairs*/
    public boolean isOneBitCharacter(int[] bits) {
        int numberOfOnes = 0;
        int n = bits.length;
        int i = n-2; //excluding the last 0;
        while(i >= 0)
        {
            if(bits[i] != 1) break;
            numberOfOnes++;
            i--;
        }
        return (numberOfOnes % 2 == 0);
    }
}
