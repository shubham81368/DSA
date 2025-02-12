import java.util.*;

class Accio{
    static int MaximumDistance(int N,int[] arr){
        //write code here
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                max=Math.max(max,i-map.get(arr[i]));
            }
            else{
                map.put(arr[i],i);
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans=obj.MaximumDistance(n,nums);
        System.out.println(ans);
    }
}