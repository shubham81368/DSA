class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int result[]=new int[n];
       //total xor of nums array
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }

        //to find flip first find the mask having all set bit
        int mask=(1<<maximumBit)-1;//it gives max k value

        for(int i=0;i<n;i++){
            int k=xor^mask;//this will give me the flipped value of k
            result[i]=k;
            xor^=nums[n-1-i];
        }
        
        return result;

    }
}