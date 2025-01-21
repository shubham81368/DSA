import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        Solution obj=new Solution();
        int ans=obj.solve(n);
        System.out.println(ans);
    }
}

class Solution{
    
    static int solve(int n)
    {
        if(n==0)return 0;
          // Your code here
          int m=n&(n-1);//first ans karenge ek n ke just chote no.solve
          //ab exor kar denge n solve
          m=n^m;
          int ans=(int)(Math.log(m)/Math.log(2));
           ans++;
           return ans;
       
    }
}