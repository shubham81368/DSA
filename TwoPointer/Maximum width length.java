class Solution {
    //t.c=O(n)
    //s.c=o(n)
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        int maxRight[]=new int[n];
        maxRight[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            maxRight[i]=Math.max(maxRight[i+1],nums[i]);
        }

        int ramp=0;
        int i=0;//for iterate to nums
        int j=0;//for iterate to maxright
        while(j<n){
            if(i<j && nums[i]>maxRight[j])i++;

            ramp=Math.max(ramp,j-i);
            j++;
        }
        return ramp;
    }
}