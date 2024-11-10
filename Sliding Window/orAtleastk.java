class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int result=Integer.MAX_VALUE;
        List<Integer>vec=new ArrayList<>(Collections.nCopies(32,0));
        while(j<n){
           update(nums[j],vec,1);//here 1 pass kiya bitpositon of set bit ko inc karne ke liye
           //if the curr window has sum >=k
           while(i<=j && getDecimalFromBinary(vec)>=k){
            result=Math.min(result,j-i+1);
            update(nums[i],vec,-1);//remove num[i] from window
            i++;
           }
             j++;
           
        }
        return result==Integer.MAX_VALUE?-1:result;
    }


    void update(int number,List<Integer>vec,int val){
        for(int i=0;i<32;i++){
            if(((number>>i)&1)==1){
                vec.set(i,vec.get(i)+val);
            }
        }
    }

    int getDecimalFromBinary(List<Integer>vec){
        int num=0;
        for(int i=0;i<32;i++){
            if(vec.get(i)>0)
            num|=(1<<i);
        }
        return num;
    }
}