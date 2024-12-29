import java.util.*;

public class Main {
    static int maximum_occurrence(int arr[], int n) {
        //Write code here
        //time complexity=
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //                arr[j]=arr[j+1];
        //                arr[j+1]=temp;
        //         }
        //     }
        // }
        //     int currCnt=0;
        //     int res=arr[0];
        //     int maxCnt=0;
        //     int element=0;
        //     for(int i=1;i<n;i++){
        //         if(arr[i]==arr[i-1]){
        //             currCnt++;
        //         }
        //         else{
        //             currCnt=1;
        //         }
        //         if(currCnt>maxCnt){
        //             maxCnt=currCnt;
        //              res=arr[i-1];
                     
        //         }
        //     }
        //     return res;
        
    

        //time complexity=O(n*N)
        //     int element=0;
        //     int ans=0;
        //     for(int i=0;i<n-1;i++){
        //         int cnt=0;
        //         for(int j=i+1;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             cnt++;
        //         }
        //     }
        //   if(ans<cnt){
        //     ans=cnt;
        //     element=arr[i];
        //   }
        // }
        // return element;

              TreeMap<Integer,Integer>mp=new TreeMap<>();
              for(int i=0;i<n;i++){
                
                    mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
                
              }
              int max=0;
              int e=-1;
              for(int ele:mp.keySet()){
                if(max<mp.get(ele)){
                    max=mp.get(ele);
                    e=ele;
                }
              }
              return e;
    }
    

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }
}
