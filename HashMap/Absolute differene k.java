import java.io.*;
import java.util.*;

class Solution {
    public long pairDifference(int []A, int n, int k) {
       // write code here
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int num:A){
        map.put(num,map.getOrDefault(num,0)+1);
       }
         int cnt=0;
        if(k==0){
            for(int num:map.values()){
                if(num>1){
                    cnt++;
                }
            }
        }
        else{
       for(int num:map.keySet()){
         if(map.containsKey(num-k)){
            cnt++;
         }
        //  if(map.containsKey(num+k)){
        //     cnt++;
        //  }
       }
        }
       
       return cnt;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.pairDifference(mat,n,k));
        System.out.println('\n');
    }
}
