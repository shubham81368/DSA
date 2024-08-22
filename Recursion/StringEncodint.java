import java.util.*;

public class Main {
    public static void printEncodings(String str) {
        // Write your code here
        helper(str,0,"");
		
    }
    public static void helper(String str,int i,String curr){
        if(i==str.length()){
            System.out.println(curr);
            return;
        }
        //one digit
        int oneDigit=str.charAt(i)-'0';
        if(oneDigit==0){
            return;
        }
        if(oneDigit>0){
            helper(str,i+1,curr+(char)('a'+oneDigit-1));
        }
        //two oneDigit
        if(i==str.length()-1)return;//last index

        int twoDigit=Integer.parseInt(str.substring(i,i+2));//last index not included in substring
        if(twoDigit<=26){
            helper(str,i+2,curr+(char)('a'+twoDigit-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
    }
}