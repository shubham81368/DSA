class Solution {
    int n;
    int m;
    public long mostPoints(int[][] questions) {
        n=questions.length;
        m=questions[0].length;
    
      long[] dp=new long[n];
    
            Arrays.fill(dp,-1);
        
        return helper(questions,0,dp);
    }

    long helper(int[][] questions,int i,long[] dp){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        long take=questions[i][0]+helper(questions,i+questions[i][1]+1,dp);
        long not_take=helper(questions,i+1,dp);
        dp[i]=Math.max(take,not_take);
        return dp[i];
    }
}