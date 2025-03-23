import java.util.*;

class Accio{
    static int MinimumSwapsToSort(int n, int[] nums){
       //write code here
       Pair[] arr=new Pair[n];
       for(int i=0;i<n;i++){
          arr[i]=new Pair(nums[i],i);
       }
         Arrays.sort(arr,(a,b)->Integer.compare(a.num,b.num));
        boolean visited[]=new boolean[n];
         int cnt=0;
         for(int i=0;i<n;i++){
            if(visited[i] || arr[i].idx==i){
                continue;
            }
            int j=i;
            int cycletime=0;
            while(!visited[j]){
                visited[j]=true;;
                j=arr[j].idx;
                cycletime++;
            }

            if(cycletime>1){
                cnt+=(cycletime-1);
            }
         }
            return cnt;
    }

    static class Pair{
        int num;
        int idx;
        Pair(int n,int i){
            num=n;
            idx=i;
        }
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
        int ans = obj.MinimumSwapsToSort(n,nums);
        System.out.println(ans);
    }
}