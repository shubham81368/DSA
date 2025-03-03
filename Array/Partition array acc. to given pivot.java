class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        int n=arr.length;
        int idx=-1;
        int[] ans=new int[n];
    
        for(int i=0;i<n;i++){
            if(arr[i]<pivot){
                 ans[++idx]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==pivot){
                ans[++idx]=pivot;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>pivot){
                ans[++idx]=arr[i];
            }
        }
        return ans;
    }
}