class Solution {
    public int maximumSum(int[] nums) {
        int n=nums.length;
       int ans[]=new int[n];
       for(int i=0;i<n;i++){
        ans[i]=digit(nums[i]);
       }
       Map<Integer,Integer>map=new HashMap<>();//digitssum and arr[i]max value
       int res=-1;
       for(int i=0;i<n;i++){
        if(map.containsKey(ans[i])){
            res=Math.max(res,nums[i]+map.get(ans[i]));
            if(map.get(ans[i])<nums[i]){
                map.put(ans[i],nums[i]);
            }
        }
        else{
            map.put(ans[i],nums[i]);
        }

       }
       return res;

        
    }

    int digit(int num){
        int ans=0;
        while(num>0){
            ans+=num%10;
            num/=10;
        }
        return ans;
    }
}