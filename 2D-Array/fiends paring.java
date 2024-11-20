import java.util.*;

class Solution {
 
    public int countFriendWays(int n) {
        // write your code here
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=(dp[i-1]%10000007+dp[i-2]*(i-1))%10000007;
        }
        return dp[n]%10000007;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.countFriendWays(N));

    }
}