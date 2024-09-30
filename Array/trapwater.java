import java.io.*;
import java.util.*;

class Solution {
    public void TappingWater(int[] arr, int n) {
        //Write code here and print output
        
        //first calculate left max for each building no max then take itself
        int lmax[]=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],arr[i]);
        }

        //calculate of right max if not exit then take itself
        int rmax[]=new int[n];
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
       //now find trap water over each building
       int trapsum=0;
        for(int i=0;i<n;i++){
            int minheight=Math.min(lmax[i],rmax[i]);
            //subtact height of bulding;
                 trapsum+=(minheight-arr[i]);
        }
        System.out.print(trapsum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n= sc.nextInt();
      	    int[] arr= new int[n];

      	    for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
        
            Solution Obj = new Solution();
            Obj.TappingWater(arr, n);
            
        
        sc.close();
        
    }
}