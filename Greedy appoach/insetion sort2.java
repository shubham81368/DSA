import java.util.*;

public class Main {

    public static void insertionSort(int arr[], int n) {
        // write code here
        for(int i=0;i<n;i++){
            if(i==0)continue;
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
            }
            
             for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            
             System.out.println();
            }
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
    }
}