class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int p=nums[i]*nums[j];
                mp.put(p,mp.getOrDefault(p,0)+1);
            }
        }
             int cnt=0;
        for(int num:mp.values()){
            
                cnt+=(num*(num-1))/2;
            
        }
        return cnt*8;
    }
}