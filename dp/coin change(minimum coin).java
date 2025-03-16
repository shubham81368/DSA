class Solution {
    int dp[];
    public int minCoins(int coins[], int sum) {
        // code here
        dp=new int[sum+1];
        Arrays.fill(dp,-1);
        int ans=helper(coins,sum);
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
    
    public int helper(int coins[],int sum){
        if(sum==0)return 0;
        if(sum<0)return Integer.MAX_VALUE;
        if(dp[sum]!=-1)return dp[sum];
        int min=Integer.MAX_VALUE;
        for(int j=0;j<coins.length;j++){
            int ans=helper(coins,sum-coins[j]);
            if(ans!=Integer.MAX_VALUE){
            min=Math.min(min,1+ans);
            }
        }
        dp[sum]=min;
        return min;
    }
}