import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        String p = br.readLine();
        Solution sol = new Solution();
        System.out.println(sol.numberOfOccurrences(s, p));
    }
}

class Solution {
    static int mod=1000000007;
    public int numberOfOccurrences(String s, String p) {
        int n=s.length();
        int m=p.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,0,s,p,dp);
        
    }


    public int helper(int i,int j,String s,String p,int[][] dp){
        if(j==p.length())return 1;
        if(i==s.length())return 0;
         if(dp[i][j]!=-1)return dp[i][j];
        int cnt=helper(i+1,j,s,p,dp);

        if(s.charAt(i)==p.charAt(j)){
            cnt+=helper(i+1,j+1,s,p,dp);
        }
         dp[i][j]=cnt%mod;
         return dp[i][j];
    }
}