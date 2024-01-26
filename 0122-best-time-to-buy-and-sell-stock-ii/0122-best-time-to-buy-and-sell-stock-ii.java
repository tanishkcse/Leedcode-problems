class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit =0;
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit+= prices[i]-prices[i-1];
                maxProfit = profit;
                
            }
            else
            buy = prices[i];
        }
        return maxProfit;
        
    }
}