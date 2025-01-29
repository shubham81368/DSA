import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        
    }
}
class Node{
    int r;
    int c;
    int d;
    Node(int r,int c,int distance){
        this.r=r;
        this.c=c;
        d=distance;
    }
}
class Solution
{
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int[][] dis=new int[n][m];
        Queue<Node>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    vis[i][j]=1;
                    q.add(new Node(i,j,0));
                }
                else{
                    vis[i][j]=0;
                }
            }
        }

        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};

        while(!q.isEmpty()){
           Node node=q.poll();
           int row=node.r;
           int col=node.c;
           int steps=node.d;
           dis[row][col]=steps;
           for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0){
                vis[nrow][ncol]=1;
                q.offer(new Node(nrow,ncol,steps+1));
            }
           }
        }
       return dis;
    }
}