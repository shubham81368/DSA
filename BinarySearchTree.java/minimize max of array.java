class Solution {
    public int minimizeArrayValue(int[] nums) {
        int n=nums.length;
        int maxL=0;
        int maxR=0;
        for(int num:nums){
            maxR=Math.max(num,maxR);
        }
        int res=-1;
        while(maxL<=maxR){
            int mid=maxL+(maxR-maxL)/2;
            if(isPossible(nums,mid)){
                res=mid;
                maxR=mid-1;
            }
            else{
                maxL=mid+1;
            }
        }

        return res;
    }

    public boolean isPossible(int[] nums,int midmax){
        int n=nums.length;
        long[] arr=new long[n];//convert to long to avoid overflow
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>midmax)return false;
            long buffer=midmax-arr[i];
            arr[i+1]=arr[i+1]-buffer;
        }
        return arr[n-1]<=midmax;

    }
}