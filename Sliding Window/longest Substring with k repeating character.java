import java.util.*;

class Solution {
    public int longestSubstring(String s, int k) {
        // write code here
        int n=s.length();
        int maxLen=0;
        for(int uc=1;uc<=26;uc++){
            int i=0,j=0;
            Map<Character,Integer>map=new HashMap<>();
            while(j<n){
                 
                 map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(map.size()>uc){
                    //ab shrink karenge window ko
                    while(map.size()>uc){
                        if(map.get(s.charAt(i))==1)map.remove(s.charAt(i));
                        else{
                            map.put(s.charAt(i),map.get(s.charAt(i))-1);
                        }
                        i++;
                    }
                }
                 boolean flag=true;
                 //now check freq of each Character
                 for(Character it:map.keySet()){
                    if(map.get(it)<k){
                        flag=false;
                        break;
                    }
                 }
                 if(flag==true){
                    maxLen=Math.max(maxLen,j-i+1);
                 }
                j++;
            }
        }
        return maxLen;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        Solution Obj =  new Solution();
        System.out.println(Obj.longestSubstring(str,k));
    }
}
