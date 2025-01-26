import java.util.*;

class Solution {
    static String keypad[]={".,","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public int GetKPC(String s) {
        // Write your code here
         return helper(s,0,1);
    }

    public int helper(String s,int i,int currentCount){
        if(i==4){
            if(i<s.length())return 0;
            return currentCount;
        }
        if(i<s.length()){
            int key=s.charAt(i)-'0';
            return helper(s,i+1,currentCount*(keypad[key].length()));
        }
        else{
            //if we run out the i before 4
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
	Solution Obj = new Solution();
        int ans = Obj.GetKPC(s);
        System.out.println(ans);
    }
}