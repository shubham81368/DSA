import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public void merge(int[][] arr) {
      // Your code here, Print your output here
      int n=arr.length;
       Arrays.sort(arr,new Comparator<int[]>(){
        public int compare(int[] a,int[] b){
            return a[0]-b[0];
        }
       });

       List<List<Integer>>ans=new ArrayList<>();

       for(int i=0;i<n;i++){
        int start=arr[i][0];
        int end=arr[i][1];
        if(!ans.isEmpty()&& end<=ans.get(ans.size()-1).get(1)){
            continue;
        }
        for(int j=i+1;j<n;j++){
            if(arr[j][0]<=end){
                end=Math.max(end,arr[j][1]);
            }
            else{
                break;
            }
        }
        ans.add(Arrays.asList(start,end));
       }
       for(List<Integer>it:ans){
        System.out.println(it.get(0)+" "+it.get(1));
       }
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        int[][] A = new int[m][2];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.merge(A);
        
    }
}