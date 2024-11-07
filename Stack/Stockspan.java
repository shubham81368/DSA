import java.io.*;
import java.util.*;

class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s  = new Solution();
        int ans[] = s.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    static int[] stockSpan(int[] a) {
        
        int idx[]=nextLargestElementLeft(a);
         int ans[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            ans[i]=i-idx[i];
        }
        return ans;
    }

    static int[] nextLargestElementLeft(int a[]){

    int n=a.length;
        int[] ans=new int[n];
        Stack<Integer>st=new Stack<>();
         
        for(int i=0;i<n;i++) {
            while(st.size()>0 && a[st.peek()]<=a[i]){
                st.pop();
            }

            if(st.size()==0){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}