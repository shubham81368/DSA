import java.util.*;

class Accio {
    public long CountPairs(int[] nums, int k) {
        //Write your code here
          int map[]=new int[k];
        long pairCount=0;
        //here count of remainder 
        for(int element:nums){
            int rem=element%k;
            //ye negative  ka bhi remainder positive me convert kar lega      
            map[rem]++;  
        }
        //case 1 if remainder is zero for no1%k==0 or no2%k==0
        pairCount+=(map[0]*(map[0]-1))/2;//this formula calculate no. of pairs 

        //case 2 if reaminder is not zero and modulo of n1%k!=n2%k;or r1!=k-r1
        for(int i=1;i<=k/2;i++){
            int comp=k-i;
            if(i!=comp)
            pairCount+=(map[i]*map[comp]);
        }
        //if k is even
        if(k%2==0)
        pairCount+=(map[k/2]*(map[k/2]-1))/2;
        return pairCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }


        Accio Obj = new Accio();
        System.out.println(Obj.CountPairs(arr, k));

    }
}