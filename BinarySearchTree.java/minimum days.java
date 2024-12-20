import java.io.*;
import java.util.*;

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        //write code here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int day:bloomDay){
            min=Math.min(day,min);
            max=Math.max(max,day);
        }

        int s=min;
        int e=max;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isPossible(bloomDay,mid,m,k)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
        
    }

    boolean isPossible(int[]bloomDay,int minday,int m,int k){
        int cnt=0;
        int total=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=minday){
                cnt++;
            }
            else{
                cnt=0;
            }
            if(cnt==k){
                cnt=0;
                total++;
            }
            if(total>=m){
                return true;
            }
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.minDays(arr, m, k));
        sc.close();
    }
}
