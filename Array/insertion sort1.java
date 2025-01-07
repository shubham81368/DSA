import java.util.*;
import java.io.*;

public class Main {
    
    static void insertionSort1(int arr[],int n){
               //Write your code here
               for(int i=n-1;i>=0;i--){
                int j=i;
                boolean print=false;
                while(j>0 && arr[j-1]>arr[j]){
                    int temp=arr[j];
                         arr[j]=arr[j-1];
                   if(print==false){
                    for(int num:arr){
                        System.out.print(num+" ");
                        print=true;
                    }
                    System.out.println();}
                      arr[j-1]=temp;
                }
               }
               for(int num:arr){
                        System.out.print(num+" ");
                    
                    }
        }

        	
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }   
        insertionSort1(a,n);
    }
}