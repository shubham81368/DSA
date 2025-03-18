class Solution {
    static int dp[][];
    static boolean equalPartition(int arr[]) {
        // code here
         
         int n=arr.length;
         int sum=0;
         for(int num:arr){
             sum+=num;
         }
         if(sum%2==1)return false;
         
         dp=new int[n+1][sum+1];
         for(int[] row:dp){
             Arrays.fill(row,-1);
         }
         
          sum=sum/2;
         return helper(arr,sum,0)>0?true:false;
    }
    
    static int helper(int arr[],int sum,int i){
        if(sum==0)return 1;
        if(sum<0)return 0;
        if(i==arr.length)return 0;
        if(dp[i][sum]!=-1)return dp[i][sum];
        int take=helper(arr,sum-arr[i],i+1);
        int not_take=helper(arr,sum,i+1);
        return dp[i][sum]=(take>0||not_take>0)?1:0;
    }
}