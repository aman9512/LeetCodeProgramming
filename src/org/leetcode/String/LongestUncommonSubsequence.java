package org.leetcode.String;

public class LongestUncommonSubsequence {
	 public int findLUSlength(String a, String b) {
	        if(a.equals(b)) return -1; //if the strings are of the same values then there will never be a uncommon subsequence
	        return Math.max(a.length(), b.length()); //otherwise return the longest string
	    }
}
