import java.io.*;
import java.util.*;
 class Solution{
 static String solve(String s){
       // Write your code here
      // Split the string by dots
        String[] words = s.split("\\.");
        // Use StringBuilder to construct the reversed string
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(".");
            }
        }
        
        return reversed.toString();
    
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String s = br.readLine();
 
         String out_ = Solution.solve(s);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
}

