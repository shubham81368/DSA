import java.util.*;

class Solution {
    public int longestSubstring(String s) {
        //Write your code here
     
        int l=0;
    
        int maxlen=0;
        int n=s.length();
        HashSet<Character>set=new HashSet<>();
       for(int r=0;r<n;r++){
        if(set.contains(s.charAt(r))){
            while(l<r && set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
        }
        set.add(s.charAt(r));
        maxlen=Math.max(maxlen,r-l+1);
       }

       return maxlen;
    }
}

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        int ans=ob.longestSubstring(s);
        System.out.println(ans);
    }
}