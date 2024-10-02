import java.util.*;

class Solution{
    static int[] SlidingWindowMaximum(int N, int K, int[] arr){
        // write code here

        //t.c=o(n*k) s.c=o(N-K)
        int ans[]=new int[N-K+1];
        int lastwin=N-K;
        for(int i=0;i<=lastwin;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<=K+i-1;j++){
                max=Math.max(max,arr[j]);
            }
            ans[i]=max;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] ans=obj.SlidingWindowMaximum(n,k,nums);
        for(int i=0;i<ans.length;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
