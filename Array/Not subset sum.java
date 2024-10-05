class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        int n=arr.length;
        long ans=1;
        for(int i=0;i<n;i++){
            if(arr[i]<=ans){
                ans+=arr[i];
            }
        }
        return ans;
    }
}