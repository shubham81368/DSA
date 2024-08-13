import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt(), n = sc.nextInt();
    int[][] grid = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        grid[i][j] = sc.nextInt();
      }
    }
    sc.close();
    System.out.println(numEnclaves(grid));
  }

public static void dfs(int grid[][],int vis[][],int n,int m,int r,int c){
  vis[r][c]=1;
  int  dx[]={1,0,-1,0};
  int dy[]={0,1,0,-1};
  for(int i=0;i<4;i++){
    int nr=r+dx[i];
    int nc=c+dy[i];
    if(nr>=0&&nc>=0&&nr<n&&nc<m&&grid[nr][nc]==1&&vis[nr][nc]==0){
      dfs(grid,vis,n,m,nr,nc);
    }
  }
}
  public static int numEnclaves(int[][] grid) {
    // your code here
      int n=grid.length;
      int m=grid[0].length;
      int vis[][] =new int[n][m];
      
     //call dfs for  all 1's  at boundary
     //first row, last row, first col,  last column

     for(int j=0;j<m;j++){
      //first row
      if(vis[0][j]==0&&grid[0][j]==1){
        dfs(grid,vis,n,m,0,j);
      }
    //last row
      if(vis[n-1][j]==0&&grid[n-1][j]==1){
        dfs(grid,vis,n,m,n-1,j);
      }
     }

     for(int i=0;i<n;i++){
      //first col
      if(vis[i][0]==0&&grid[i][0]==1){
        dfs(grid,vis,n,m,i,0);
      }

      //last col
      if(vis[i][m-1]==0&&grid[i][m-1]==1){
        dfs(grid,vis,n,m,i,m-1);
      }
     }

     //iterate over all the grid and find no of unvisted ones
     int count=0;
     for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(grid[i][j]==1&&vis[i][j]==0)count++;
      }
     }
     return count;
      
  }
}