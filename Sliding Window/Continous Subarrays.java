class Solution {
    public long continuousSubarrays(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        long cnt=0;
        TreeMap<Integer,Integer>mp=new TreeMap<>();

        while(j<n){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            while(Math.abs(mp.lastKey()-mp.firstKey())>2){
                mp.put(nums[i],mp.get(nums[i])-1);
                if(mp.get(nums[i])==0){
                   
                    mp.remove(nums[i]);
                }
                i++;
            }
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
}