import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        int ans = Solution.getMaxMarker(arr, n, m);
        System.out.println(ans);
    }
}
class Solution 
{
    static int getMaxMarker(ArrayList<Integer> arr, int n, int m) 
    {
       int s=0;
       int e=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        if(arr.get(i)>e){
            e=arr.get(i);
        }
       }
       int ans=-1;
       while(s<=e){
        int mid=s+(e-s)/2;
        if(isPossible(arr,mid,m)){
           ans=mid;
           s=mid+1;
        }
        else{
            e=mid-1;
        }
       }
       return ans;
    }

    static boolean isPossible(ArrayList<Integer>fruits,int marker,int m){
        long total_fruits=0;
        for(int fruit:fruits){
            if(fruit>marker){
                total_fruits+=(fruit-marker);
            }
            if(total_fruits>=m){
                return true;
            }
        }
        return false;
    }
}