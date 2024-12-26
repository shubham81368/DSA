class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        
        return solve(nums,0,target ,0);
    }

    public int solve(int[] nums,int currsum,int target,int idx){
        if(idx==nums.length){
            if(currsum==target)return 1;
            return 0;
        }
        int plus=solve(nums,currsum+nums[idx],target,idx+1);
        int minus=solve(nums,currsum-nums[idx],target,idx+1);
        return plus+minus;
    }
}