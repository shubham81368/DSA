
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int badDay=0;
        int min=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>min){
                badDay++;
            }
            min=Math.min(arr[i],min);
        }
        System.out.print(badDay);
    }
}