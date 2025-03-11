class Solution {
    
    int dp[];
    int countWays(int n) {
        // your code here
        dp=new int[n+1];
        Arrays.fill(dp,-1);
      
        return helper(n);
        
    }
    
    int helper(int i){
        if(i==0){
           return 1;
        }
        if(dp[i]!=-1)return dp[i];
        int cnt=0;
        if(i-1>=0){
            cnt+=helper(i-1);
        }
        if(i-2>=0){
           cnt+=helper(i-2);
        }
        dp[i]=cnt;
        return dp[i];
    }