class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    sum=Math.max(sum,(long)(nums[i]-nums[j])*nums[k]);
                }
            }
        }
        return sum;
    }
}