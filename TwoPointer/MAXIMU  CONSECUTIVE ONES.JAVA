import java.io.*;
import java.util.*;

class Solution{
     public static int maxConsecutiveOnes(int[] arr, int n) {
        // Your code here
         
         int c=0;int max=0;
         for(int i=0;i<n;i++){
             if(arr[i]==1){c++;max=Math.max(c,max);}
             else c=0;
             
         }
         return max;
     }
}

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxConsecutiveOnes(arr, n));
    }
}
