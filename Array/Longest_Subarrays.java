class Solution {
    public int longestSubarray(int[] nums) {
        //first we find max number 
        //second step find max length of max number means max no. lagataar kitni baar aa rha hai
        //or ek resutl bhi lena hoga kyoki ham baar baar lengeth ko update kar rhe honge
    //eg.nums{5,5,5,3,5,5,5,5}here so las me 5 aa rha hai uski length jada hai to 4 return hoga
           int maxVal=0;
           int maxLen=0;
           int streak=0;//means continous me kitne hai
           for(int num:nums){
            if(maxVal<num){
                maxVal=num;
                streak=0;
                maxLen=0;
            }
            if(maxVal==num){
                streak++;
            }
            else{
                streak=0;
            }
            maxLen=Math.max(maxLen,streak);
           }
           return maxLen;
    }
}