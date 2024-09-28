//T.c=o(k*n)
//s.c=o(n);//dynamic array 
class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        //we use karanege dp kyoki TLE aa jayega
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        return helper(0,k,arr,dp);
    }
    
    public int helper(int i,int k,int[] arr,int[] dp){
        if(i==arr.length-1)return 0;
        
        if(dp[i]!=-1)return dp[i];
        
        int ans=Integer.MAX_VALUE;
        for(int j=i+1;j<=i+k&&j<arr.length;j++){//imporatant line
            int cost=Math.abs(arr[i]-arr[j])+helper(j,k,arr,dp);
            ans=Math.min(ans,cost);
        }
        return dp[i]=ans;
    }
}