import java.util.*;

class Solution {
    public int score(int n,int m, int[][] A) {
        // write code here
      
        //firt flip msb beat if zero row wise
        for(int i=0;i<n;i++){
            if(A[i][0]==0){
                for(int j=0;j<m;j++){
                    A[i][j]=1-A[i][j];
                }
            }
        }

        //if no. of zeros geater then ones in column start from1
        for(int j=1;j<m;j++){
            int cntzero=0;
           for(int i=0;i<n;i++){
            if(A[i][j]==0){
                cntzero++;
            }
           }
           int cntones=n-cntzero;
           if(cntzero>cntones){
            //flip the column
            for(int i=0;i<n;i++){
                A[i][j]=1-A[i][j];
            }
           }
        }

        //now calculate the total sum
        int total_sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total_sum+=(A[i][j]<<(m-j-1));
            }
        }
        return total_sum;
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        sc.close();
        System.out.println(Obj.score(n, m, arr));
    }
}   