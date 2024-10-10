import java.io.*;
import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
		// write code here
        int n=s.length();

        int[] map1=new int[60];
        int[] map2=new int[60];
        for(int i=0;i<t.length();i++){
            map1[(int)(t.charAt(i)-'A')]++;
        }
        for(int i=0;i<t.length()-1;i++){
//yahan hamm ek length kam chalyenge or loop me include kar lege
            map2[(int)(s.charAt(i)-'A')]++;
        }

        int i=0,j=t.length()-1;
        int len=Integer.MAX_VALUE;
        String ans="";
        while(j<n){
            map2[(int)(s.charAt(j)-'A')]++;

            boolean flag=true;
            for(int k=0;k<60;k++){
                if(map1[k]!=0 && map1[k]>map2[k])
                flag=false;
            }

            while(flag){
                if(len>j-i+1){
                len=j-i+1;
                 ans=s.substring(i,i+len);
                }
                  //exclude from left side
             map2[(int)(s.charAt(i)-'A')]--;
             if(map1[(int)(s.charAt(i)-'A')]>map2[(int)(s.charAt(i)-'A')])
             flag=false;
             i++;
            }
           j++;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,t;
        s = sc.next();
		t = sc.next();
        Solution Obj = new Solution();
        System.out.print(Obj.minWindow(s,t));
    }
}