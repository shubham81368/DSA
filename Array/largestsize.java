class Solution {
    public int largestCombination(int[] candidates) {
        // int count[]=new int[32];//because integer size size contsit 32 bit
        int maxSize=0;
        //t.c=o(n)
        for(int bitposition=0;bitposition<32;bitposition++){//o(32)
        int count=0;
            for(Integer num:candidates){//o(n)
                if((num&(1<<bitposition))!=0){
                    // count[bitposition]++;
                    count++;
                }
            }
            // maxSize=Math.max(maxSize,count[bitposition]);
            maxSize=Math.max(maxSize,count);
        }
        return maxSize;
    }
}