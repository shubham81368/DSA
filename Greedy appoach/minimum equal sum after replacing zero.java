class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0;
        long sum2=0;
        long zeroInNum1=0;
        long zeroInNum2=0;
        for(int num:nums1){
            sum1+=num;
            if(num==0){
                sum1+=1;
                zeroInNum1++;
            }
        }

        for(int num:nums2){
            sum2+=num;
            if(num==0){
                sum2+=1;
                zeroInNum2++;
            }
        }

        if(sum1<sum2 && zeroInNum1==0)return -1;
        if(sum2<sum1 && zeroInNum2==0)return -1;
        return Math.max(sum1,sum2);
    }
}