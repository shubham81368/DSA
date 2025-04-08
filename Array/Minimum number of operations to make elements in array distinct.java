class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
    
        int cnt=0;
        for(int i=0;i<n;i+=3){
           if(check(nums,i)){
            return cnt;
           }
           cnt++;
        }
        return cnt;
    }

     boolean check(int[] nums,int start){
        int n=nums.length;
        Set<Integer>set=new HashSet<>();
        for(int i=start;i<n;i++){
            if(set.contains(nums[i]))return false;
            set.add(nums[i]);
        }
        return true;
     }
}