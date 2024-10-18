class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr=0;
        for(int num:nums){
            maxOr|=num;
        }
        int currOr=0;
        return noOfSubset(0,currOr,nums,maxOr);
    }

    public int noOfSubset(int i,int currOr,int nums[],int maxOr){
        if(i==nums.length){
            if(currOr==maxOr){
                return 1;
            }
            return 0;
        }

        //if take
        int takecount=noOfSubset(i+1,currOr|nums[i],nums,maxOr);
        //if not take
        int nottakecount=noOfSubset(i+1,currOr,nums,maxOr);
        return takecount+nottakecount;
    }
}