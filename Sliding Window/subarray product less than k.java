class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int p=1;
        int n=nums.length;
        int cnt=0;
        while(j<n){
            p*=nums[j];
           
            while(i<=j && p>=k){
                p/=nums[i];
                i++;
            }
            cnt+=(j-i+1);
            j++;
        }
        return cnt;
    }
}