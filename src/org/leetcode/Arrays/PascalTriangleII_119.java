package org.leetcode.Arrays;
import java.util.*;

public class PascalTriangleII_119 {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList(Collections.nCopies(rowIndex+1, 0));
        row.set(0,1);
        for(int i = 1; i <= rowIndex; i++)
        {
            for(int j = i; j > 0; j--)
            {
                int tempC = row.get(j) + row.get(j-1);
                row.set(j, tempC);
            }
        }
        return row;
    }
}
