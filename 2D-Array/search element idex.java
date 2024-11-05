import java.util.*;

class Pair{
    int x; int y;
    
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            Pair p = search(arr, x);
            System.out.println(p.x+" "+p.y);
        }
    }

    public static Pair search(int[][] matrix, int x) {
        //Write your code here
        Pair idx=new Pair(-1,-1);
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==x){
                   return idx=new Pair(i,j);
                }
            }
        }
        return idx;
      }
}
