import java.util.*;
  
public class Main{
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        valueOfExpression(str);

    }
    public  static void valueOfExpression(String str)
    {
        // your code here
        Stack<Integer>val=new Stack<>();
        Stack<String>infix=new Stack<>();
        Stack<String>post=new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            if(c>='0'&&c<='9'){
                val.push(c-'0');
                infix.push(c+"");
                post.push(c+"");
            }
            else{
                solve(val,infix,post,c);
            }
        }

        System.out.println(val.pop());
        System.out.println(infix.pop());
        System.out.println(post.pop());
        
    }
    public static void solve(Stack<Integer>val,Stack<String>infix,Stack<String>post,char c){
        String val1=infix.pop();
        String val2=infix.pop();
        infix.push("("+val1+c+val2+")");

        val1=post.pop();
        val2=post.pop();
        post.push(val1+val2+c);

        int a=val.pop();
        int b=val.pop();
        if(c=='+')val.push(a+b);
        else if(c=='-')val.push(a-b);
        else if(c=='/')val.push(a/b);
        else if(c=='*')val.push(a*b);
    }
}