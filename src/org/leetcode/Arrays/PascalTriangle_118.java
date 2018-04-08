package org.leetcode.Arrays;
import java.util.*;

//https://www.mathsisfun.com/pascals-triangle.html this link explains pascal triangle
public class PascalTriangle_118 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        for(int i = 0; i < numRows; i++)
        {
            List<Integer> row = new ArrayList();
            for(int j = 0; j < i+1; j++)
            {
                if(j == 0 || j == i) row.add(j, 1); //beginning and end elements are 1
                else //rest elements are addition of directly above 2
                {
                    int tempCol = result.get(i-1).get(j-1) + result.get(i-1).get(j);                                    
                    row.add(j, tempCol);
                }
            }
            result.add(row);
        }
        return result;
    }
}
