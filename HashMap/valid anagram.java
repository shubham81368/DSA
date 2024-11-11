import java.util.*;

class Solution {
   static boolean areAnagram(String c1, String c2) {
       //Write your code here
       if(c1.length()!=c2.length())return false;

       HashMap<Character,Integer>map1=new HashMap<>();
       HashMap<Character,Integer>map2=new HashMap<>();
      for(char c:c1.toCharArray()){
         map1.put(c,map1.getOrDefault(c,0)+1);
      }
      for(char c:c2.toCharArray()){
        map2.put(c,map2.getOrDefault(c,0)+1);
      }

      for(char c:c1.toCharArray()){
        if(map1.get(c)!=map2.get(c))return false;
      }
      for(char c:c2.toCharArray()){
        if(map1.get(c)!=map2.get(c))return false;
      }
      return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();
        
        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
