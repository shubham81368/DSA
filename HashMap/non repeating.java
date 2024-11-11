import java.io.*;
import java.util.*;

class Solution {
    public void nonRepeatingCharacter(String s) {
        // Your code here
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        boolean flag=false;
        for(char c:s.toCharArray()){
            if(map.get(c)==1){
                System.out.print(c);
                flag=true;
                break;
                
            }
        }
        if(flag==false){
            System.out.print(-1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();
        Solution Obj = new Solution();
        Obj.nonRepeatingCharacter(s);  
        System.out.println();
    }
}