import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer> res = diagonalTraversal(mat, n);
        for (Integer x : res)
            System.out.print(x + " ");
    }

    public static ArrayList<Integer> diagonalTraversal(int[][] mat, int n) {
        // your code here
        ArrayList<Integer>ans=new ArrayList<>();
      //upper part of diagonal
        for(int i=n-1;i>=0;i--){
            int rowIdx=0;
            int colIdx=i;
            int sum=rowIdx+colIdx;
            while(rowIdx<n && colIdx<n){
                
                    ans.add(mat[rowIdx][colIdx]);
                
                rowIdx++;
                colIdx++;
            }
        }
//lower part of diagonal start from second row
        for(int i=1;i<n;i++){
            int rowIdx=i;
            int colIdx=0;
            while(rowIdx<n && colIdx<n){
                ans.add(mat[rowIdx][colIdx]);
                rowIdx++;
                colIdx++;
            }
        }
        return ans;
        
    }
}