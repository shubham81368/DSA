class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int minDis[]=new int[V];
        
        Arrays.fill(minDis,Integer.MAX_VALUE);
        
        minDis[src]=0;
        
        //ab ham har ek node par n-1 time traverse karenge edges par 
        for(int i=1;i<V;i++){
            for(int[] edge:edges){
                int u=edge[0];
                int v=edge[1];
                int w=edge[2];
                
                if(minDis[u]!=Integer.MAX_VALUE && minDis[u]+w<minDis[v]){
                    minDis[v]=minDis[u]+w;
                }
            }
        }
        //check negative cylcle
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            if(minDis[u]!=Integer.MAX_VALUE && minDis[u]+w<minDis[v]){
                return new int[]{-1};
            }
        }
        
        for(int i=0;i<V;i++){
            if(minDis[i]==Integer.MAX_VALUE)minDis[i]=100000000;
        }
        return minDis;
    }
}