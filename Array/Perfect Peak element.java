import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

  public static int perfectPeak(int[] A) {
  // write your code here
   int n=A.length;
   int lmax[]=new int[n];
   int rmax[]=new int[n];
   lmax[0]=A[0];
   rmax[n-1]=A[n-1];
   for(int i=1;i<n;i++){
	lmax[i]=Math.max(lmax[i-1],A[i]);
   }
   for(int i=n-2;i>=0;i--){
	rmax[i]=Math.min(rmax[i+1],A[i]);
   }
   int ans=0;
   for(int i=1;i<n-1;i++){
	if(A[i]>lmax[i-1]&&A[i]<rmax[i+1]){
		ans=1;
		break;
	}
   }
  return ans;
}
  
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
  	int[] array = new int[n];
    for(int i=0;i<n;i++)
	    array[i] = sc.nextInt();
		System.out.println(perfectPeak(array));
	}
}