class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int left=1;
        int right=1;
        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        //ek baar left se travel karenge
        for(int i=0;i<n;i++){
            left*=arr[i];
            lmax=Math.max(lmax,left);
            if(left==0){
                left=1;
            }
        }
        
        //ab rigth se travel karenge
        for(int j=n-1;j>=0;j--){
            right*=arr[j];
            rmax=Math.max(rmax,right);
            if(right==0){
                right=1;
            }
        }
        
        return Math.max(lmax,rmax);
    }
}