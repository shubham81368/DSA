import java.util.*;

public class Main {
    
     static char MaximumFrequencyChar(String s) {
        // Write your code here
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
          count[s.charAt(i)-'a']++;
        }
        int max=0;
        char ans='a';
       for(int i=0;i<26;i++){
            if(count[i]>max){
              max=count[i];
              ans=(char)('a'+i);
            }
       }
         return ans;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(MaximumFrequencyChar(s));
    }
}