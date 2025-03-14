import java.util.*;

class Accio{
    static boolean TriangularNumber(int n){
        //write code here

         int discriminent=1+8*n;
         int sqrtdiscriminent=(int)Math.sqrt(discriminent);
         if(sqrtdiscriminent*sqrtdiscriminent==discriminent){
            int k=(-1+sqrtdiscriminent)/2;
            if(k*(k+1)/2==n){
                return true;
            }
         }
         return false;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio obj = new Accio();
        boolean ans = obj.TriangularNumber(n);
        if(ans){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
