import java.util.*;

class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        //Write code here
        int n=matrix.length;
        int m=matrix[0].length;
        int ans=Integer.MIN_VALUE;

        for(int r1=0;r1<n;r1++){
            for(int c1=0;c1<m;c1++){
                //har ek row column ke liye sum cal karenge
                int pref[][]=new int[n][m];
                for(int r2=r1;r2<n;r2++){
                    for(int c2=c1;c2<m;c2++){
                        //rectangle formed
                        int v1=0;//upper rectangle
                        if(r2-1>=0)v1=pref[r2-1][c2];
                        int v2=0;//left rectangle
                        if(c2-1>=0)v2=pref[r2][c2-1];
                        int v3=0;//corner rectangle
                        if(r2-1>=0 && c2-1>=0)
                        v3=pref[r2-1][c2-1];

                        pref[r2][c2]=matrix[r2][c2]+v1+v2-v3;
                        if(pref[r2][c2]<=k){
                            ans=Math.max(ans,pref[r2][c2]);
                        }
                    }
                }
            }
        }
        return ans;
          
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        }
        int k;
        k = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.maxSumSubmatrix(matrix, k));
        sc.close();
    }
}