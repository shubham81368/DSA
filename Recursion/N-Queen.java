import java.util.*;

public class Main {
    public static int totalNQueens(int n) {
        // write code here
        int grid[][] =new int[n][n];
        return helper(grid,0,n);
    }

    public static int helper(int grid[][] ,int r,int n){
        if(r==n){return 1;}
        int ct=0;
        for(int i=0;i<n;i++){//here we go each column
            if(isSafe(grid,r,i,n)){
                grid[r][i]=1;
                ct+=helper(grid,r+1,n);//here we inc each row
                grid[r][i]=0;

            }
        }
        return ct;
    }
     public static boolean isSafe(int grid[][],int r,int c,int n){
        //upper coloumn
        for(int i=0;i<r;i++){
            if(grid[i][c]==1)return false;
        }

        //upper right diagonal
        int i=r-1,j=c-1;
        while(i>=0&&j>=0){
            if(grid[i][j]==1)return false;
            i--;
            j--;
        }
        //upper left diagonal
        i=r-1;
        j=c+1;
        while(i>=0&&j<n){
            if(grid[i][j]==1)return false;
            i--;
            j++;
        }
        return true;
     }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        System.out.println(totalNQueens(n));
    }
}