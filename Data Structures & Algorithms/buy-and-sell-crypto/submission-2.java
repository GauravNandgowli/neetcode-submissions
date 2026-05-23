class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0, sellDay = 1, prof = 0;
        while(sellDay < prices.length){
            if(prices[buyDay] < prices[sellDay]){
                int profit = prices[sellDay] - prices[buyDay];
                prof = Math.max(prof, profit);
            }else{
                buyDay = sellDay;
            }
            sellDay++;
        }
        return prof;
    }
}
