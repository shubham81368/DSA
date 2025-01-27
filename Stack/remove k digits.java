import java.util.*;

class Solution {
    public static String removeKdigits(String num, int k) {
        //Write your code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){
            while(sb.length()>0 && sb.charAt(sb.length()-1)>num.charAt(i) && k>0){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            if(sb.length()>0 || num.charAt(i)!='0'){
                sb.append(num.charAt(i));
            }
        }

        while(k>0){
            sb.deleteCharAt(sb.length()-1);
            k--;
        }
        if(sb.length()==0)return "0";
        return sb.toString();
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        String result = Solution.removeKdigits(num, k);
        System.out.println(result);
    }
}