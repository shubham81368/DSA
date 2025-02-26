vclass Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int n=nums.length;
        int sum=0;
        while(i<n){
           sum+=nums[i];
           max=Math.max(max,sum);
           if(sum<0){
            sum=0;
           }
           i++;
        }
        i=0;
        int min=Integer.MAX_VALUE;
         sum=0;
        while(i<n){
            sum+=nums[i];
            min=Math.min(min,sum);
            if(sum>0){
                sum=0;
            }
            i++;
        }

        return Math.max(-1*min,max);
    }
}