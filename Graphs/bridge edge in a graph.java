class Solution {
    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // code here
        int[] vis=new int[V];
        
         //make adj list
         ArrayList<ArrayList<Integer>>adj=new ArrayList<>(V);
         
         for(int i=0;i<V;i++){
             adj.add(new ArrayList<>());
         }
         
         for(int i=0;i<edges.length;i++){
             int u=edges[i][0];
             int v=edges[i][1];
             adj.get(u).add(v);
             adj.get(v).add(u);
         }
         
         
         
         dfs(adj,c,vis,c,d);
         if(vis[d]==1)return false;
         
         return true;
        
    }
    
    public void dfs(ArrayList<ArrayList<Integer>>adj,int node,int[] vis,int c,int d){
        vis[node]=1;
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0 && !(c==node && nbr==d)){//here we skip the edge from c to d
                dfs(adj,nbr,vis,c,d);
            }
        }
    }
}
