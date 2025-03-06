import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void sqrt(int A) {
        // your code here
       if(A==0 || A==1){
        System.out.print(A);
        return ;
       }
        int s=1;
        int e=A/2;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
           
            if(mid<=A/mid){
                s=mid+1;
                 ans=mid;
            }
            else{
                e=mid-1;
               
            }
        }
        System.out.print(ans);
    }

  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int A = sc.nextInt();
	  
    sqrt(A);
		
	}
}