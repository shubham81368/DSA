class Solution {
    public int triangleNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n<3)return 0;
        int cnt=0;
        for(int i=2;i<n;i++){
            int l=0;
            int r=i-1;
            while(l<r){
                int sum=nums[l]+nums[r];
                if(sum>nums[i]){
                    cnt+=(r-l);
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return cnt;
    }
}