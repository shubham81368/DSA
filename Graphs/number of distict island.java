import java.util.*;

class Solution {


  
  public static int countDistinctIslands(int[][] grid) {
    // write your code here
    int n=grid.length;
    int m=grid[0].length;
    int[][] vis=new int[n][m];
    HashSet<ArrayList<String>>mp=new HashSet<>();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1 && vis[i][j]==0){
                ArrayList<String>vec=new ArrayList<>();
                dfs(i,j,grid,vis,vec,i,j);
                mp.add(vec);
            }
        }
    }
    return mp.size();
  }
  public static void dfs(int row,int col,int[][] grid,int[][] vis,ArrayList<String>vec,int row0,int col0){
         vis[row][col]=1;
         vec.add(toString(row0-row,col0-col));
         int n=grid.length;
         int m=grid[0].length;
         int delrow[]={1,0,-1,0};
         int delcol[]={0,1,0,-1};
         for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                dfs(nrow,ncol,grid,vis,vec,row0,col0);
            }
         }
  }
  static String toString(int r,int c){
    return Integer.toString(r)+" "+Integer.toString(c);
  }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        Solution ob = new Solution();
        int ans = ob.countDistinctIslands(grid);
        System.out.println(ans);
    }
}