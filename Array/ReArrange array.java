class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        
        int maxIdx=n-1;
        int minIdx=0;
        long divisor=arr[maxIdx]+1;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
            arr[i]=(arr[maxIdx]%divisor)*divisor+arr[i];
            maxIdx--;
        }
        else{
            arr[i]=(arr[minIdx]%divisor)*divisor+arr[i];
            minIdx++;
        }
        }
        
        //now divide the array by divisor to get exact no.
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/divisor;
        }
    
    }
    
}