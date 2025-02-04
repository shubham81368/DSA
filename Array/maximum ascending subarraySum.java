class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0;
        int n=nums.length;
        int i=0;
        int j=0;
        int csum=0;
        while(j<n){
            csum+=nums[j];
            while(j>0 && i!=j&& nums[j]<=nums[j-1]){
                csum-=nums[i];
                i++;
            }
            sum=Math.max(sum,csum);
            j++;
        }
        return sum;
    }
}