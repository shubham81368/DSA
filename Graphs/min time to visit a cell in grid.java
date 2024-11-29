class Solution {
    public int minimumTime(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        if(grid[1][0]>1 && grid[0][1]>1)return -1;

        //result sc.O(n*m)
        boolean vis[][]=new boolean[m][n];
         int[][] result=new int[m][n];
         for(int[] row:result){
            Arrays.fill(row,Integer.MAX_VALUE);
         }

         PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[0]-b[0]));
         pq.offer(new int[]{0,0,0});

         int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
         result[0][0]=0;
         while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int time=curr[0];
            int i=curr[1];
            int j=curr[2];

            if(i==m-1 && j==n-1)return result[m-1][n-1];
            if(vis[i][j]==true)continue;
            vis[i][j]=true;
            //now iterate over adjacent;
            for(int[] dir:directions){
                int x=i+dir[0];
                int y=j+dir[1];
                if(x<0 || x>=m || y<0 || y>=n ||vis[x][y]==true)continue;
                int nextTime;
                if(grid[x][y]<=time+1){
                    nextTime=time+1;
                }
                else if((grid[x][y]-time)%2==0){//even
                    nextTime=grid[x][y]+1;
                }
                else{
                    nextTime=grid[x][y];
                }
              //here min time tme store
                if(nextTime<result[x][y]){
                    result[x][y]=nextTime;
                    pq.offer(new int[]{nextTime,x,y});
                }

            }
         }
         return -1;
    }
}