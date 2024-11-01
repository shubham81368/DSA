class Solution {
    public long maxSum(Long[] arr) {
        // code here
        int n=arr.length;
        int i=0,j=n-1;
        Arrays.sort(arr);
        
        long sum=0;
        while(i<j){
            sum+=arr[j]-arr[i]+arr[j]-arr[i+1];
            i++;
            j--;
        }
        sum+=arr[n/2]-arr[0];
        return sum;
        
    }
}