import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.minOperations(arr, x));
        sc.close();
    }
}

class Solution {
    public int minOperations(int[] nums, int x) {
        //write code here
        //yahan ek hashmaplenge taki pta kar sake kon sa sum kab aaya hai
        HashMap<Integer,Integer>mp=new HashMap<>();//ye code bss positive no. ke liya work karega
        
        //zero sum hamare pass index -1  pe hai
        mp.put(0,-1);

        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            mp.put(sum,i);
        }
             if(sum<x)return -1;
        int remainingsum=sum-x;
        int maxLen=-1;
        sum=0;
        for(int i=0;i<nums.length;i++){
              sum+=nums[i];
            if(mp.containsKey(sum-remainingsum)){
                maxLen=Math.max(maxLen,i-mp.get(sum-remainingsum));
            }
        }

        return maxLen==-1?-1:nums.length-maxLen;
    }
};