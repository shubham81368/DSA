class Solution {
    int sum;
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        sum=0;
        helper(nums,0,0);
        return sum;

    }

    public void helper(int[] nums,int i,int currXor){
        if(i==nums.length){
            sum+=currXor;
            return ;
        }
        //take 
        helper(nums,i+1,nums[i]^currXor);
        //not take
        helper(nums,i+1,currXor);
       
    }


}