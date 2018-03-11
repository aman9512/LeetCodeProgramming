package org.leetcode.String;

public class JudgeRouteCircle {
	  public boolean judgeCircle(String moves) {
	      //0 = U&D, 1 = L&R
	      int[] a = new int[2];
	      for(int i = 0; i < moves.length(); i++)
	      {
	          switch(moves.charAt(i))
	          {
	              case 'U': a[0]++; break;
	              case 'D': a[0]--; break;
	              case 'L': a[1]++; break;
	              case 'R': a[1]--; break;
	          }
	      }
	        
	      return (a[0] == 0 && a[1] == 0);
	    }
}
