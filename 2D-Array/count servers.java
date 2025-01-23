class Solution {
    public int countServers(int[][] grid) {
        
        int cnt=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    boolean flag=false;
                    for(int col=0;col<m;col++){
                         if(grid[i][col]==1 && j!=col){
                            flag=true;
                         }
                    }
                    if(flag==true)cnt++;
                    else{
                        for(int row=0;row<n;row++){
                            if(grid[row][j]==1 && i!=row){
                                flag=true;
                            }
                        }
                        if(flag==true)cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}