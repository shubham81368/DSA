class Solution {
    public int search(int[] nums, int target) {
          int s=0;
          int e=nums.length-1;
          int pivot=pivotIdx(nums,s,e);
          int ans=-1;
          if(nums[pivot]<=target && target<=nums[e]){
             ans=searchIdx(nums,pivot,e,target);
          }
          else{
            ans=searchIdx(nums,s,pivot,target);
          }
          return ans;
    }


    int pivotIdx(int nums[],int s,int e){
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[0]<=nums[mid]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }

    int searchIdx(int nums[],int s,int e,int target){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}