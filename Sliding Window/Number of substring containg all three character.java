import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	   public static void main(String args[]) {
		  
		   Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	           
	        Solution obj= new Solution();
	        System.out.println(obj.numberOfSubstrings(s));
	    }
}
class Solution{
	   public static int numberOfSubstrings(String s) {
//your code
//t.c=o(n)
     int cnt=0;
	 int lastseen[]=new int[3];
	  for(int i=0;i<3;i++){
		lastseen[i]=-1;
	  }

	  for(int i=0;i<s.length();i++){
		lastseen[s.charAt(i)-'a']=i;
		if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1){
			cnt=cnt+1+Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]));
		}
	  }
	  return cnt;
}
}