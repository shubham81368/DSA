class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            r=Math.max(r,nums[i]);
        }
        int result=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(nums,mid,maxOperations)){
                result=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return result;
    }


    boolean ispossible(int[] nums,int mid,int maxOp){
        int totalOps=0;
        for(int num:nums){
            int ops=num/mid;
            if(num%mid==0){
                ops-=1;
            }
            totalOps+=ops;
        }
        return totalOps<=maxOp?true:false;
    }
}