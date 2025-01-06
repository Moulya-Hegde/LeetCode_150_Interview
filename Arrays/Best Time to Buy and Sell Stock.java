package Arrays;

/*
 121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

 class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int low=prices[0];
        int high=prices[0];
        for(int i=1;i<prices.length;i++){
            if (prices[i]<low){
                low=prices[i];
                high=prices[i];
            }
            if(prices[i]>high){
                high=prices[i];
            }
            max=Math.max(max,high-low);
        }
        return max;
    }
}