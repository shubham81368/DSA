import java.util.*;

class Solution {
    static int maxOne(int arr[], int n,int k)
    {
        //Write your code here
      int l=0,r=0,maxLen=0,zero=0;
        
       while(r<n){  //t.c=O(n+n)=O(n)    s.c=o(1)
           
           if(arr[r]==0)zero++;
           
           while(zero>k){
               if(arr[l]==0)zero--;
               l++;
           }
           
           if(zero<=k){
               maxLen=Math.max(maxLen,r-l+1);
           }
           r++;
       }
           return maxLen;
       
       }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.maxOne(array,n,k));
    }
}