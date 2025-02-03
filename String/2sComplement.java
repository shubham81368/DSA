import java.io.*;
import java.util.*;

class Solution{
    static String complement(String bi){
        //Write your code here
        int n=bi.length();
        String s="";
        boolean flag=false;
        for(int i=n-1;i>=0;i--){
            char c=bi.charAt(i);
          if(flag==false && c!='1'){
            s=c+s;
          }
          else if(flag==false && c=='1'){
            s=c+s;
            flag=true;
          }
          else{
               
               if(c=='0'){
                s='1'+s;
               }
               else{
                s='0'+s;
               }
          }
        }
        return s;
    }
}
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String bi = in.readLine();
        Solution ob = new Solution();
        System.out.println(ob.complement(bi));
    }
}