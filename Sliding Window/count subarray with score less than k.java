class Solution {
    public long countSubarrays(int[] nums, long k) {
        long p=0;
        int i=0;
        int j=0;
        int n=nums.length;
        long cnt=0;
        while(j<n){
            p+=nums[j];
            
            while(p*(j-i+1)>=k && i<=j){
                p-=nums[i];
                
                i++;
            
            }
            cnt+=(j-i+1);
            
            j++;
        }
        return cnt;
    }
}