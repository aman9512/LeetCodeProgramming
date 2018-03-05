package org.leetcode.dynamicProgramming;
//#516 on leetcode
public class LongestPalindromicSubsequence {
	 //subsequence means by deleting some char and keeping the order
    /*
    Longest palindromic subsequence
    Rules: found at https://www.youtube.com/watch?v=yZWmS6CXbQc&list=PLeIMaH7i8JDjMEB-b2I8NGcKMFZc85djW&index=9&t=0s
    1. Mark all diagonals as “1” and everything below the diagonal as 0 dp[I][i] = 1;
    2. If the letters don’t match then get the dp[i][j] = max of dp[I][j-1] and dp[I+1][j]
    3. If the letters match then dp[i][j] = dp[i+1][j-1]+2
    4. Always traverse in diagonal order. 
    */
    public int longestPalindromeSubseq(String s) {
        if(s.length() <= 1) return s.length();
        int n = s.length();
        int[][] dp = new int[n][n]; 
        
        //mark all the diagonals as 1 and by default java fills the array with value of 0
        for(int i = 0; i < n; i++)
            dp[i][i] = 1;
        
        for(int i = n-1; i >= 0; i--) //doing this in reverse order because i relies on "i+1"
        {
            for(int j = i+1; j < n; j++)
            {
                if(s.charAt(i) == s.charAt(j)) dp[i][j] = dp[i+1][j-1]+2;
                else dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
            }
        }
        
        return dp[0][n-1];
    }
}
