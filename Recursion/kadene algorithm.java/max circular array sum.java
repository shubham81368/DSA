import java.util.*;

class Solution {
    public int MaxSum(int[] arr, int n) {
        // Write your code here
            int totalsum=0;
            int maxsum=Integer.MIN_VALUE;
            int minsum=Integer.MAX_VALUE;
            int currsum=0;
            //kadane alg;
            for(int num:arr){
                currsum+=num;
                totalsum+=num;
                maxsum=Math.max(currsum,maxsum);
                if(currsum<0)currsum=0;
            }
           //ab ham revrse kadane
           currsum=0;

           for(int num:arr){
            currsum+=num;
            minsum=Math.min(minsum,currsum);
            if(currsum>0){
                currsum=0;
            }
           }
           return Math.max(maxsum,totalsum-minsum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
	    Solution Obj = new Solution();
        int ans = Obj.MaxSum(arr, n);
        System.out.println(ans);
    }
}