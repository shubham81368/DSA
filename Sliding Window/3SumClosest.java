class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closestSum=Integer.MAX_VALUE;
    
        for(int i=0;i<=n-3;i++){
            int s=i+1;
            int e=n-1;
            while(s<e){
            
                int sum=nums[s]+nums[e]+nums[i];

                if(Math.abs(target-sum)<Math.abs(target-closestSum)){
                    closestSum=sum;
                }

                if(sum>target){
                   
                    e--;
                }
                else{
                   s++;
                }
            }
    
        }
        return closestSum;

}
}