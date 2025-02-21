import java.util.*;
import java.io.*;

class Solution{
    public static int minimumDeletions(String s){
        //Write your code here
        int n=s.length();
        int[] a=new int[n];
        int[] b=new int[n];

        for(int i=1;i<n;i++){
            b[i]=b[i-1];
            if(s.charAt(i-1)=='b')b[i]++;

        }
        for(int i=n-2;i>=0;i--){
            a[i]=a[i+1];
            if(s.charAt(i+1)=='a')a[i]++;
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,a[i]+b[i]);
        }
        return min;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Solution.minimumDeletions(s));
        sc.close();
    }
}