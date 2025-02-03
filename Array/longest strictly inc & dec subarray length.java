class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int maxlen=0;
        while(j<n){
            while(j>0 && i!=j&& nums[j]<=nums[j-1]){
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }

        i=n-1;
        j=n-1;
        while(j>=0){
            while(j!=n-1&&i!=j &&nums[j]<=nums[j+1]){
                i--;
            }
            maxlen=Math.max(maxlen,i-j+1);
            j--;
        }
        return maxlen;
    }
}