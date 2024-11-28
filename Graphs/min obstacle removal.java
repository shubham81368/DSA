class Solution {
    public int minimumObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int result[][]=new int[m][n];
        for(int[] row:result){
            Arrays.fill(row,Integer.MAX_VALUE);
        }

        result[0][0]=0;
        //priroity queue(obstacle,Pair(i,j))
        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.offer(new int[]{0,0,0});//obstacle,i,j

        int directions[][]={{0,1},{1,0},{-1,0},{0,-1}};
        while(!pq.isEmpty()){
           int[] current=pq.poll();
           int obstaclecnt=current[0];
           int i=current[1];
           int j=current[2];
           //four direction move
           for(int[] dir:directions){
            int x=i+dir[0];
            int y=j+dir[1];
            //check x & y within the bound
            if(x>=0 && x<m && y>=0 && y<n){
                int wt=(grid[x][y]==1)?1:0;

                if(obstaclecnt+wt<result[x][y]){
                    result[x][y]=obstaclecnt+wt;
                    pq.offer(new int[]{obstaclecnt+wt,x,y});
                }
            }
           }
        }
        return result[m-1][n-1];
    }
}