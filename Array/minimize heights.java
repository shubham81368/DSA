class Solution {
    public int getMinDiff(int k, int[] arr) {
        // code here
        int n=arr.length;
        int max=0,min=0;
        Arrays.sort(arr);
        int minDiff=arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++){
        //0 TO i-1 value inc
        //i to n-1 value dec
                max=Math.max(arr[i-1]+k,arr[n-1]-k);
                min=Math.min(arr[i]-k,arr[0]+k);
                minDiff=Math.min(minDiff,max-min);
            
        }
        return minDiff;
    }
}