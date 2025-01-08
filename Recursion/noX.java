import java.util.*;

public class Main {
    static String noX(String s) {
        // Write your code here
     return helper(s,0);
        
    }

    static String helper(String s,int i){
        if(i==s.length()){
        //agar koi element nhi string me to empty aayega
            return "";
        }
        if(s.charAt(i)=='x'){
            return helper(s,i+1);
        }
        return s.charAt(i)+helper(s,i+1);
        //character aapas me concatenate hoke string dete hai
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(noX(s));
    }
}