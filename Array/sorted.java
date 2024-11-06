class Solution {
    public boolean canSortArray(int[] nums) {
        int n=nums.length;
        boolean swapped=true;
        for(int i=0;i<n;i++){
             swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(nums[j]<=nums[j+1]){
                    continue;
                }
                else{
                    if(Integer.bitCount(nums[j])==Integer.bitCount(nums[j+1])){
                        swapped=true;
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                    else{
                        return false;
                    }
                }
            }
            if(swapped==false)break;
        }
        return true;
    }
}