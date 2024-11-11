class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Arrays.sort(arr);
        
        int prev=arr[0];
        int op=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=prev){//alway remeber condition
    
                op=op+(prev+1-arr[i]);
                prev++;
            }
            else{
                prev=arr[i];
            }
        }
        return op;
    }
}