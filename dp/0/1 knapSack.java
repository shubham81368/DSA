class Solution {
    static int dp[][];
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        
        dp=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                dp[i][j]=-1;
            }
        }
        return helper(W,val,wt,0);
    }
    
    
    static int helper(int W,int val[],int wt[],int i){
        if(i==val.length)return 0;
        
        if(dp[i][W]!=-1)return dp[i][W];
        int pick=0;
        if(W-wt[i]>=0)
         pick=val[i]+helper(W-wt[i],val,wt,i+1);
        
        int not_pick=helper(W,val,wt,i+1);
        
        dp[i][W]=Math.max(pick,not_pick);
        return dp[i][W];
        }
}