package org.leetcode.dynamicProgramming;
//#5 on leetcode
public class LongestPalindromicSubstring {
	/*idea is to expand from the center
    keep iterating left and right until the chars dont match and return the length of a palindromic substring
    Time complexity: O(N^2)
    Space complexity: O(N)
    */
    public String longestPalindrome(String s) 
    {
        int start = 0;
        int end   = 0;
        int n     = s.length();
        int len   = 0;
        int currentLen = 0;
        
        for(int i = 0; i < n; i++)
        {
            int len1 = expandFromCenter(s, i, i);
            int len2 = expandFromCenter(s, i, i+1);
            len      = Math.max(len1, len2); //here we'll get maxLength
            if(currentLen < len) //found new longer palindromic substring
            {
                //keep track of start and end
                //remember that i is the center
                currentLen = len;
                end = i+(len/2);
                start = i-(len/2);
                if(len == len2) start +=1; //for even string
                
            }
        }
        
        return s.substring(start, end+1);
    }
    
    public int expandFromCenter(String s, int left, int right)
    {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        
        //return the length of a palindromic string
        return right - left - 1;
    }
}
