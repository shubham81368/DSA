class Solution {
    int rows;
    int cols;
    public int findMaxFish(int[][] grid) {
        int maxFish=0;
        rows=grid.length;
        cols=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0){
                    maxFish=Math.max(maxFish,dfs(i,j,grid));
                }
            }
        }
        return maxFish;
    }
    int dfs(int i,int j,int[][] grid){
        if(i<0 ||i>=rows || j<0 || j>=cols||grid[i][j]==0){
            return 0;
        }

        int ans=grid[i][j];
        grid[i][j]=0;
        ans+=dfs(i-1,j,grid)+dfs(i,j+1,grid)+dfs(i+1,j,grid)+dfs(i,j-1,grid);
        return ans;
    }
}