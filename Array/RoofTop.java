class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int max=0;
        int count=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                max++;
                count=Math.max(count,max);
            }else{
                max=0;
            }
        }
        return count;
    }
}