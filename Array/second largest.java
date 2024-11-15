class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max=arr[0];
        
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            
            }
        }
        int max2=-1;
        for(int i=0;i<n;i++){
            if(max2<arr[i] && arr[i]!=max){
                max2=arr[i];
            }
        }
        return max2;
    }
}