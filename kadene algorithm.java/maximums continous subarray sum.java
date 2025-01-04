import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        Solution ob =new Solution();
        long ans = ob.maxSubarraySum(a,n);
        System.out.println(ans);
    }
}
class Solution{
    public long maxSubarraySum(int a[],int n){
        //Write code here
        long currsum=0;
        long maxSum=Integer.MIN_VALUE;
        for(int num:a){
            currsum+=num;
            maxSum=Math.max(maxSum,currsum);
            if(currsum<0){
                currsum=0;
            }
        }
        return maxSum;
    }
}