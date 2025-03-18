class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int psum=0;
        int i=0;
        int j=0;
        int maxlen=1;
        while(j<n){
            
            while((psum&nums[j])!=0){
                psum^=nums[i];
                i++;
            }
            psum|=nums[j];
            maxlen=Math.max(maxlen,j-i+1);
            j++;

        }
        return maxlen;
    }
}