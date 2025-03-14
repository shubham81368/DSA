class Solution {
    int dp[][];

    public int count(int coins[], int sum) {
        // code here.
    
        int n=coins.length;
        dp=new int[n+1][sum+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(coins,sum,n-1);
        
    }
    
    int helper(int coins[],int sum,int i){
        if(i==0){
            if(sum%coins[0]==0)return 1;
            return 0;
        }
        
        if(dp[i][sum]!=-1)return dp[i][sum];
        
        int nottake=helper(coins,sum,i-1);
        
        int take=0;
        if(coins[i]<=sum){
            take=helper(coins,sum-coins[i],i);//here  i not dec bcz we can take multiple time
        }
        
        return dp[i][sum]=take+nottake;
    }