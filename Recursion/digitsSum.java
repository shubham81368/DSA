import java.util.Scanner;


public class Main {


    public static String superDigit(String str, int k)
    {
        //Write your code here
       long digitSum=0;
       for(char c:str.toCharArray()){
           digitSum+=(c-'0');
       }

       long intialsum=digitSum*k;
        
        return ""+helper(intialsum);
        
    }

    public static long helper(long num){
        if(num<10){
           return num;
        }
        long sum=0;
         while(num>0){
            sum+=num%10;
            num/=10;
         }

         return helper(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println(superDigit(str,k));
    }
}
