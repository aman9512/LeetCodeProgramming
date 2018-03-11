package org.leetcode.String;

public class DetectCapital {
	//all letters capital, or all lower case, or 1st uppercase
    public boolean detectCapitalUse(String word) {
        String temp = new String(word);
        if(word.equals(temp.toUpperCase())) return true;
        if(word.equals(temp.toLowerCase())) return true;
        if(Character.isUpperCase(word.charAt(0)))
        {
            for(int i = 1; i < word.length(); i++)
            {
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
            return true;
        }
        return false;
    }
}
