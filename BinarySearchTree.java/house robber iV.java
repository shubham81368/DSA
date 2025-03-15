class Solution {
    public int minCapability(int[] nums, int k) {
        int n=nums.length;
        int s=Integer.MAX_VALUE;
        int e=Integer.MIN_VALUE;
        for(int num:nums){
            s=Math.min(s,num);
            e=Math.max(e,num);
        }
        int ans=-1;//becz given it is always possible to steal k houses
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isPossible(nums,mid,k)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] nums,int mid,int k){
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                cnt++;//means ek house le liya hai
                i++;//bcz hame continous me ni lena hai
            }
            if(cnt==k)return true;
        }
        return false;
    }
}