
import java.util.*;
import java.io.*;

class Solution{
	static void quickSort(int[] arr){
        //Write code here
        int n=arr.length;
        sort(arr,0,n-1);
    }

   static void sort(int[] arr,int s,int e){
        if(s>=e)return;
        int p=partition(arr,s,e);
        //left half
        sort(arr,s,p-1);
        sort(arr,p+1,e);
    }

    static int partition(int[] arr,int s,int e){
        int pivot=arr[e];
        int i=s-1;//agar pivot ke picche koi element nhi hai
        for(int j=s;j<=e-1;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //ab last me pivot index ko swap kar denge
        int temp=arr[i+1];
        arr[i+1]=arr[e];
        arr[e]=temp;
        return i+1;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
		Obj.quickSort(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}