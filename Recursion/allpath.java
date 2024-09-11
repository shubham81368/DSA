import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int m = Integer.parseInt(inputLine[1]);


        int[][] grid = new int[n][m];
        for(int i=0; i<n; i++){
          String inputLine1[] = br.readLine().trim().split(" ");
          for(int j=0; j<m; j++){
            grid[i][j]=Integer.parseInt(inputLine1[j]);
          }
        }

        Solution g = new Solution();
        g.divisiblePaths(n, m, grid);
  }
}

class Solution
{
    void divisiblePaths(int m, int n, int[][] grid){
	//Your code here     
       int sum=0;
       helper(m,n,grid,0,0,"",sum);
    }

    public void helper(int m,int n,int[][] grid,int i,int j,String s,int sum){
      //horizontal
      if(i==m-1&&j==n-1&& (sum+grid[i][j])%5==0){
        
        System.out.println(s);
        return ;
      }

      
      if(i<m && j<n && grid[i][j]!=-1){
        
        helper(m,n,grid,i,j+1,s+"h",sum+grid[i][j]);
      }
      if(i<m && j<n && grid[i][j]!=-1){
      
        helper(m,n,grid,i+1,j+1,s+"d",sum+grid[i][j]);
      }
        if(i<m&&j<n&&grid[i][j]!=-1){
          
        helper(m,n,grid,i+1,j,s+"v",sum+grid[i][j]);
        }
      
    }
} 

