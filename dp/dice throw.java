class Solution {
    static int dp[][];
    static int noOfWays(int m, int n, int x) {
        // code here
        dp=new int[51][51];
        
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(m,n,x);
    }
    
    
    static int helper(int m,int n,int x){
        if(x<0)return 0;
        if(dp[n][x]!=-1)return dp[n][x];
        if(x==0 && n==0)return 1;
        
        if(n==0)return 0;
        int result=0;
        for(int faceVal=1;faceVal<=m;faceVal++){
            result+=helper(m,n-1,x-faceVal);
        }
        
        
        return dp[n][x]=result;
    }
};