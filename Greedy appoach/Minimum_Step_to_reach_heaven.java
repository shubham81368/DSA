import java.util.*; 

class Solution{

    public int minimumsteps(int n){
          
         // write your code here
         int cnt=0;
         
         while(n>0){
         int maxDigit=0;
         int num=n;
         while(num>0){
         int digit=num%10;
         maxDigit=Math.max(digit,maxDigit);
         num/=10;
         }
         cnt++;
         n-=maxDigit;
    }
    return cnt;

    }
} 

public class Main {
    public static void main(String args[]) {
        
         Scanner scn = new Scanner(System.in); 
         int n = scn.nextInt(); 

         Solution sol = new Solution(); 
         int ans = sol.minimumsteps(n); 

         System.out.println(ans); 
    }
}