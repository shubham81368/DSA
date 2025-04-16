class Solution {
    public void floydWarshall(int[][] dist) {
        // Code here
        int r=dist.length;
        int c=dist[0].length;
        
        int infinity=(int)1e8;
        for(int via=0;via<r;via++){//via edges to reach other node
        
        //ab edges pe traverse karenge
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(dist[i][via]!=infinity && dist[via][j]!=infinity)
                //bcz isse uper jate he overflow ho rha tha
                dist[i][j]=Math.min(dist[i][j],dist[i][via]+dist[via][j]);
            }
        }
            
        }
        
      
    }
}