import java.util.Scanner;
import java.util.Arrays;

class Solution {
    static boolean stringChallenge(String str1, String str2) {
        // Write your code here
        //t.c=O(nlogn)
        //s.c=O(n)
        int n=str1.length();
        int m=str2.length();
        if(n!=m){return false;}
      
      char[] s1=new char[n];
      char[] s2=new char[n];

      for(int i=0;i<n;i++){
        s1[i]=str1.charAt(i);
        s2[i]=str2.charAt(i);
      }

      Arrays.sort(s1);
      Arrays.sort(s2);

      for(int i=0;i<n;i++){
        if(s1[i]!=s2[i]){
            return false;
        }
      }
     return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        if (Solution.stringChallenge(str1, str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        input.close();
    }
}