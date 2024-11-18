class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        d%=n;
        
        reverse(arr,0,d);
        reverse(arr,d,n);
        
        reverse(arr,0,n);
        
        
    }
    
    
    public static void reverse(int arr[],int s,int e){
        for(int i=s;i<(e+s)/2;i++){
            int temp=arr[i];
            arr[i]=arr[e-1-(i-s)];
            arr[e-1-(i-s)]=temp;
        }
    }
}