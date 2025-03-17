class Solution {
     static int dp[][];
    static Boolean isSubsetSum(int arr[], int target) {
        // code here
        dp=new int[arr.length+1][target+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
       return helper(arr,target,0)==0?false:true;
    }
    
    
    static int helper(int arr[],int target,int i){
        
        if(target==0)return 1;
        
        if(target<0)return 0;
          if(i==arr.length)return 0;
          
          if(dp[i][target]!=-1)return dp[i][target];
        
        int take=helper(arr,target-arr[i],i+1);
        int nottake=helper(arr,target,i+1);
        if(take>0||nottake>0)dp[i][target]=1;
       else dp[i][target]=0;
        return dp[i][target];
    }
}