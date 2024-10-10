import java.io.*;
import java.util.*;

class Solution {
    public static int longestUniqueSubsttr(String str)
    {
        // Your code here
        int i=0,j=0;
        int n=str.length();
        int maxLen=Integer.MIN_VALUE;
        HashMap<Character,Integer>map=new HashMap<>();
        //only store 256 ascii character so space is cconstant
        while(j<n){
            if(!map.containsKey(str.charAt(j))){
                map.put(str.charAt(j),1);
                maxLen=Math.max(maxLen,j-i+1);
                j++;
            }
            else{
                while(str.charAt(i)!=str.charAt(j)){
                    map.remove(str.charAt(i));
                    i++;
                }
                //yahan hamm ek baar remove karenge kyoki not equal pe break ho gya tha condition
                map.remove(str.charAt(i));
                i++;
                
            }
        }
        return maxLen;
    }
}

public class Main {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();
        int len = obj.longestUniqueSubsttr(str);
        System.out.println(len);
    }
}

