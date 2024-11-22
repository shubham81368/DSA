class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int maxProfit=prices[i]-min;
            profit=Math.max(profit,maxProfit);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
    
}