import java.util.*;
import java.io.*;

class Solution {
static void mergeSort(int[] arr,int l,int r){
     // Your code here
     if(l>=r)return;
     int mid=(l+r)/2;
     //left half
     mergeSort(arr,l,mid);//log n because divide horha hai
     //right half
     mergeSort(arr,mid+1,r);//log n becausse divide ho rha hai
     //merge karnge left or right half ko
     merge(arr,l,r);
    }

    public static void merge(int[] arr,int l,int r){
        int temp[]=new int[r-l+1];
        int i=l;
        int mid=(l+r)/2;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
            temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        k=0;
        for(int x=l;x<=r;x++){
            arr[x]=temp[k++];
        }
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}