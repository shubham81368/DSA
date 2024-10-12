class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        int n=arr.length;
        if(n==1)return -1;
        
        int sum=0;
        for(int i=0;i<n-1;i++){//hame ne last index include nhi kiya hai kyoki 2 size ka lena hai
            sum=Math.max(sum,arr[i]+arr[i+1]);
        }
  
             return sum;
    }
    