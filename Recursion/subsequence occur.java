import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        String a=sc.next();
        int n=a.length();
        
        String b=sc.next();
        int m=b.length();
        Solution ss=new Solution();
        System.out.print(ss.count(a,b,a.length(),b.length()));
    }
}

class Solution{
     int count(String s1,String s2,int m,int n){
        if((m==0 && n==0)|| n==0)return 1;//if both string empty or second string empty

        if(m==0){
            return 0;//if first string is empty
        }

        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return count(s1,s2,m-1,n-1)+count(s1,s2,m-1,n);
        }
        else{
            return count(s1,s2,m-1,n);
        }
    }
}