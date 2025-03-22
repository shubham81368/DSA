class Solution {
    int dp[];
    int maxValue(int[] arr) {
        // code here
        int n=arr.length;
        //only one house
        if(n==1)return arr[0];
        dp=new int[n];
        Arrays.fill(dp,-1);
        //if we start robbing from oyh index then we have to exclude n-1 index
        int case1=helper(arr,0,n-2);
        
        //if we start robbing from first index then we have to include n-1 index
        Arrays.fill(dp,-1);
        int case2=helper(arr,1,n-1);
        
        return Math.max(case1,case2);
    }
    
    int helper(int[] arr,int i,int n){
        if(i>n)return 0;
        if(dp[i]!=-1)return dp[i];
    
        int take=arr[i]+helper(arr,i+2,n);
        int not_take=helper(arr,i+1,n);
        dp[i]=Math.max(take,not_take);
        return dp[i];
    }
}
