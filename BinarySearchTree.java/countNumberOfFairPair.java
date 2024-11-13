class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n=nums.length;
        Arrays.sort(nums);
        long cnt=0;
        for(int i=0;i<n;i++){
           int leftIdx=lowerBound(nums,i+1,n,lower-nums[i]);
            //first element not less than lowerbound(lower-nums[i])
            int rightIdx=upperBound(nums,i+1,n,upper-nums[i]);
           //first element geater than upperbound(upper-nums[i])
           int x=leftIdx-i-1;//no. pairs <lowerbound
           int y=rightIdx-i-1;//no. pairs <=uperbound
           cnt+=(y-x);

        }
        return cnt;
    }
    
    int lowerBound(int[] nums,int start,int end,int target){
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }

    int upperBound(int nums[],int start,int end,int target){
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }


}