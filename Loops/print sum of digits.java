import java.util.*;
class Solution{
	public static void sumOfDigits(int n){
		// Your code here. Print Output
        int c=0;
        for(int i=1;i<=n;i++){
            c=i;int sum=0;
            while(c!=0){
                sum=sum+c%10;
                c/=10;
            }
         System.out.println(sum);
        
       }
	}
    
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution.sumOfDigits(n);
	}
}