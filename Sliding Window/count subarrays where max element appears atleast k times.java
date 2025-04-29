class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int max=Arrays.stream(nums).max().getAsInt();
        //or we can find by iterating over the array max element
        int i=0;
        int j=0;
        int maxCount=0;
        long cnt=0;
        while(j<n){
            if(nums[j]==max){
             maxCount++;
            }

            while(maxCount>=k){
                cnt+=n-j;
                if(nums[i]==max)maxCount--;
                i++;
            }
            j++;
        }
        return cnt;
    }
}