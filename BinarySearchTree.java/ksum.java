import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.kSum(arr, n, k));
    }
}

class Solution {

    static int kSum(int arr[], int n, int k) {
           int s=1;
           int e=Integer.MIN_VALUE;
           for(int i=0;i<n;i++){
            e=Math.max(e,arr[i]);
           }
           while(s<e){
               int mid=s+(e-s)/2;
               if(isPossible(arr,mid,k)){
                  e=mid;
               }
               else{
                s=mid+1;
               }
           }
           return e;
    }

    static boolean isPossible(int[] arr,int m,int k){
        int sum=0;
        for(int num:arr){
            sum+=((int)Math.ceil((double)num/m));
        }
        return sum<=k;
    }
}