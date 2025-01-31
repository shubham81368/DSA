import java.util.*;

class Solution {
    public void MatRotateRecur(int[][] mat) {
        // Write your code here
        int n=mat.length;
        int m=mat[0].length;
        //first step transpose karna hai diagonal same he rhega
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        //now we have to reverse the row
        for(int i=0;i<n;i++){
            reverse(mat[i]);
        }

    }

    void reverse(int mat[]){
        for(int i=0;i<mat.length/2;i++){
            int temp=mat[i];
            mat[i]=mat[mat.length-i-1];
            mat[mat.length-i-1]=temp;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.MatRotateRecur(mat);

        for(int[] ar : mat) {
            for(int a : ar)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}