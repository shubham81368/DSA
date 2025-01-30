import java.io.*;
import java.util.*;

class Solution {
    public String makeGood(String s) {
        //write code here
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
          if(st.size()>0 &&(st.peek()==(char)(c+32)||st.peek()==(char)(c-32))){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        String str="";
        while(!st.isEmpty()){
            str=st.pop()+str;
        }
        return str;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.makeGood(s));
        sc.close();
    }
}
