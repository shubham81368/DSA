import java.util.*;

class Solution {
    static int countEqualSubarray01(int arr[], int n)
    {
        //Write your code here
        HashMap<Integer,Integer>mp=new HashMap<>();

        mp.put(0,1);//map me zero sum 1 baar hoga

        int ans=0;
        int sum=0;
        for(int num:arr){
            if(num==0){//agar 0 hai to -1 daalenge
                sum+=-1;
            }
            else{//agar 1 hai to 1 he aayega
               sum+=1;
            }

            if(mp.containsKey(sum)){
                ans+=mp.get(sum);
                mp.put(sum,mp.get(sum)+1);
            }
            else{
                mp.put(sum,1);
            }
        }

       return ans; 
         
    }   

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
    

        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }
        
        Solution Obj = new Solution();
        System.out.println(Obj.countEqualSubarray01(arr,N));

    }
}