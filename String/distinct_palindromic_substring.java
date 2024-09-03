import java.util.*;

public class Main {
    static void palindromeSubStrs(String s) {
        //Write your code here
        TreeSet<String>a=new TreeSet();
        
      
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                int n=sub.length();
                boolean flag=true;
                for(int k=0;k<n/2;k++){
                   if(sub.charAt(k)!=sub.charAt(n-k-1)){
                    flag=false;
                    break;
                   }
                }
                if(flag==true){
                    a.add(sub);
                }
            }
        }

       
        for(String str:a){
            System.out.println(str);
        }
    }

    // static void subsequence(String s,int i,String ans,ArrayList<String>t){
    //     if(i==s.length()){
    //         t.add(ans);
    //         return;
    //     }
        //take the ith character
        // subsequence(s,i+1,ans+s.charAt(i),t);
        // //not take 
        // subsequence(s,i+1,ans,t);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }
}