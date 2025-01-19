import java.util.*;


class Solution {
    
    public static void minSubArrayLen(int arr[], int target, int n) {
        //Write your code here
        
        int max=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;
        while(j<n){
             sum+=arr[j];
            while(sum>target){
                max=Math.min(max,j-i+1);
                sum-=arr[i];
                 i++;
             }
             j++;
        }
        if(max==Integer.MAX_VALUE){
            System.out.print(0);
        }
        else{
            System.out.println(max);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Solution.minSubArrayLen(arr,target,n);
        
    }
}
