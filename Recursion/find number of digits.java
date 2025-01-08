import java.util.*;

public class Main {
	static int numOfDigi(int n) {
        //Write code here
        return count(n);
    }

    static int count(int num){
        
        if(num==0){
            return 0;
        }
        
        
        return 1+count(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int result = numOfDigi(n);
        System.out.println(result);
        sc.close();
    }
}