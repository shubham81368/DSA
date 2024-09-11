import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(codeToNumber(str));
    }
	public static String[] arr={"-----",".----","..---","...--","....-",".....","-....","--...","---..","----.",".-.-.-"};
	public static String codeToNumber(String codes)
    {
       //Write your code
		StringBuilder s=new StringBuilder();
        String[] str=codes.split(" ");
        for(int i=0;i<str.length;i++){
            for(int j=0;j<arr.length;j++){
                if(str[i].equals(arr[j])){
                    if(j==10){
                    s.append(".");
                    }else{
                        char c=(char)(j+'0');//convert into char
                    s.append(c);
                    }
                }
                
            }
        }
        return s.toString();
    }
}
