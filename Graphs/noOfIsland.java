class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
    
}
class Solution {
    public int numIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    
    
    
    //bfs
    public void bfs(int r,int c,int[][] vis,char grid[][]){
        vis[r][c]=1;
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>q=new LinkedList<Pair>();
        q.add(new Pair(r,c));
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();//it removes first pair from front;
            
            //now traverse to their neighbours if its land then mark to  1's in visited array
            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int nrow=row+delrow;
                    int ncol=col+delcol;
                    if(nrow>=0&&nrow<n && ncol>=0&&ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
        
    }
}