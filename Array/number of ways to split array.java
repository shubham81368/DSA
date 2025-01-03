class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        int cnt=0;
        for(int num:nums){
            sum+=num;
        }
        long s=0;
        for(int i=0;i<nums.length-1;i++){
              s+=nums[i];
              if(s>=sum-s){
                cnt++;
              }
        }
        return cnt;
    }
}