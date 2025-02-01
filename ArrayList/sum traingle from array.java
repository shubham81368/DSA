import java.io.*;
import java.util.*;

class Solution {
    public void printTriangle(long[] nums) {
        //write code here and print output
        List<List<Long>>levels=new ArrayList<>();
        List<Long>currlevel=new ArrayList<>();
        for(Long num:nums){
            currlevel.add(num);
        }
        levels.add(new ArrayList<>(currlevel));

        //generate subsequence levels
        while(currlevel.size()>1){
            List<Long>nextlevel=new ArrayList<>();
            for(int i=0;i<currlevel.size()-1;i++){
                nextlevel.add(currlevel.get(i)+currlevel.get(i+1));
            }

            levels.add(new ArrayList<>(nextlevel));
            currlevel=nextlevel;
        }

        for(int i=levels.size()-1;i>=0;i--){
            print(levels.get(i));
        }
    }

    void print(List<Long>level){
      for( int i=0;i<level.size();i++){
        System.out.print(level.get(i));
        if(i<level.size()-1){
            System.out.print(", ");
        }
      }

        System.out.println();
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        obj.printTriangle(arr);
        sc.close();
    }
}
