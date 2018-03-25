package org.leetcode.Arrays;

public class BuySellStock_121 {
	 public int maxProfit(int[] prices) {
	        int profit = 0;
	        int minBuyPrice = Integer.MAX_VALUE;
	        for(int i = 0; i < prices.length; i++)
	        {
	            minBuyPrice = Math.min(minBuyPrice, prices[i]); //getting the lowest price for buying
	            profit = Math.max(profit, prices[i] - minBuyPrice); //current selling price - lowest buying price
	        }
	        return profit;
	    }
}
