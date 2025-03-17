
class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int n=arr.size();
        if(arr.get(0)<=arr.get(n-1))return 0;
         int peak=helper(arr,0,n-1);
        return peak;
    }
    
    public int helper(List<Integer>arr,int s,int e){
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr.get(0)<=arr.get(mid)){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
}