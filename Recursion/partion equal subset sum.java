class Solution {
    Boolean dp[][];//here boolean class use which take by default null value
    public boolean canPartition(int[] nums) {
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        if(totalsum%2==1)return false;
        int sum=totalsum/2;
           dp=new Boolean[nums.length][sum+1];
           
        return helper(nums,0,sum);
    }

    public boolean helper(int[] nums,int i,int sum){
        if(sum==0)return true;
        if(i==nums.length || sum<0)return false;
        
        if(dp[i][sum]!=null)return dp[i][sum];

        boolean take=helper(nums,i+1,sum-nums[i]);
        boolean not_take=helper(nums,i+1,sum);
       dp[i][sum]=take||not_take;
       return dp[i][sum];

    }
}