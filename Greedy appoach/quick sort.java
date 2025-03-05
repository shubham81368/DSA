import java.io.*;
import java.util.*;

class Accio {
       static int[] quickSort(int arr[], int n)
        {
            //Write your code here
            List<Integer>left=new ArrayList<>();
            List<Integer>equal=new ArrayList<>();
            List<Integer>right=new ArrayList<>();

            for(int i=0;i<n;i++){
                if(arr[i]<arr[0]){
                    left.add(arr[i]);
                }
                else if(arr[i]==arr[0]){
                    equal.add(arr[i]);
                }
                else{
                    right.add(arr[i]);
                }
            }

            List<Integer>res=new ArrayList<>();
            for(int num:left)res.add(num);
            for(int num:equal)res.add(num);
            for(int num:right)res.add(num);

            int ans[]=new int[res.size()];
            for(int i=0;i<res.size();i++){
                ans[i]=res.get(i);
            }
            return ans;
            
        }  
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Accio Obj = new Accio();
        int[] result= Obj.quickSort(arr1, n);
        for(int i=0;i<n;i++)
                System.out.print(result[i] + " ");       
        System.out.println('\n');
    }
}