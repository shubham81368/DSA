class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxDiff=0;
        long maxi=0;
        long res=0;
        for(int i=0;i<n;i++){
            res=Math.max(res,(long)(maxDiff*nums[i]));
            maxDiff=Math.max(maxDiff,maxi-nums[i]);
            maxi=Math.max(maxi,nums[i]);
        }
        return res;
    }
}