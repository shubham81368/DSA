import java.util.*;
import java.util.Scanner;

public class Main{
    static void printSubsequence(String s) {
        //Write your code here
        helper(0,"",s);
    }
    static void helper(int i,String curr,String s){
        if(i==s.length()){
            System.out.print(curr+" ");
            return ;
        }
        //if you take 
        helper(i+1,curr+s.charAt(i),s);
        //not take
        helper(i+1,curr,s);
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
    }
}