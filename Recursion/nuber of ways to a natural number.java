import java.io.*;
import java.util.*;
public class Main {
    static long cnt;
    public static long ways(int n, int i){
           //Write your code here
            cnt=0;
            helper(n,i,0);
            return cnt;
    }
    public static void helper(int n,int start,int sum){
        if(sum==n){
            cnt++;
            return;
        }
        for(int i=start;i<=n;i++){
            if(sum+i<=n){
                 helper(n,i+1,sum+i);
            }
        }

    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(n, 1));
    }
}