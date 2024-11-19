class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0;
        long currsum=0;
        long max=0;
        Set<Integer>set=new HashSet<>();
        while(j<n){
           while(set.contains(nums[j])){
            set.remove(nums[i]);
            currsum-=nums[i];
            i++;
           }
           currsum+=nums[j];
           set.add(nums[j]);
           if(j-i+1==k){
            max=Math.max(max,currsum);
            currsum-=nums[i];
            set.remove(nums[i]);
            i++;
           }
           j++;

        }

        return max;
    }
}