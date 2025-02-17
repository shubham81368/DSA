import java.util.*;
import java.lang.*;
import java.io.*;
class Pair{
  char c;
  int cnt;
  Pair(char c,int cnt){
    this.c=c;
    this.cnt=cnt;
  }
}
class Solution{
    public String removeDuplicates(String s, int k) {
        // write code here
        Stack<Pair>st=new Stack<>();
        for(char ch:s.toCharArray()){
              if(!st.isEmpty() && st.peek().cnt==k){
            st.pop();
          }
          if(!st.isEmpty() && st.peek().c==ch){
            st.peek().cnt++;
          }
          else{
            st.push(new Pair(ch,1));
          }
      
          
        }
        String str="";
        while(!st.isEmpty()){
          for(int i=0;i<st.peek().cnt;i++){
            str=st.peek().c+str;
          }
          st.pop();
        }
        return str;

    }
}

class Main {
  public static void main (String[] args)
	{
      Scanner sc = new Scanner(System.in);
	  String s = sc.nextLine();
	  int k = sc.nextInt();
      Solution Obj = new Solution();
      System.out.println(Obj.removeDuplicates(s,k));
	}
}