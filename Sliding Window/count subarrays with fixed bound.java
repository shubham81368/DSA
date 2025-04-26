class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long cnt=0;
        int minkIdx=-1;
        int maxkIdx=-1;
        int culpritIdx=-1;
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==minK){
                minkIdx=i;
            }
            if(nums[i]==maxK){
                maxkIdx=i;
            }
            if(nums[i]<minK ||nums[i]>maxK){
                culpritIdx=i;
            }

            int smaller=Math.min(minkIdx,maxkIdx);
            int temp=smaller-culpritIdx;
            if(temp>0){
                cnt+=temp;
            }
           
           i++;
        }
        return cnt;
    }
}