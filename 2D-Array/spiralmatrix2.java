import java.util.Scanner;
import java.util.Vector;

class Solution {
    public Vector<Integer> spiralMatrix2(Vector<Vector<Integer>> arr, int n, int m) {
         // write your code here
         Vector<Integer>ans=new Vector<>();
         int rowStart=0;
         int colStart=0;
         int rowEnd=n-1;
         int colEnd=m-1;
         int tc=n*m-1;
         int cnt=0;
         while(cnt<=tc){

             //first col
             for(int i=rowStart;i<=rowEnd && cnt<=tc;i++){
                ans.add(arr.get(i).get(colStart));
                cnt++;
             }
             colStart++;

            //last row
            for(int i=colStart;i<=colEnd && cnt<=tc;i++){
                ans.add(arr.get(rowEnd).get(i));
                cnt++;
            }
            rowEnd--;
            
            //last column
            for(int i=rowEnd;i>=rowStart && cnt<=tc;i--){
                ans.add(arr.get(i).get(colEnd));
                cnt++;
            }
            colEnd--;

            //first row
            for(int i=colEnd;i>=colStart && cnt<=tc;i--){
                ans.add(arr.get(rowStart).get(i));
                cnt++;
            }
            rowStart++;
            
         }

         return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Vector<Vector<Integer>> matrix = new Vector<>(n);

            for (int i = 0; i < n; i++) {
                Vector<Integer> row = new Vector<>(m);
                for (int j = 0; j < m; j++) {
                    row.add(sc.nextInt());
                }
                matrix.add(row);
            }

            Solution ob = new Solution();
            Vector<Integer> result = ob.spiralMatrix2(matrix, n, m);
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
        }
    }
}