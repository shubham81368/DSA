class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        int vis[]=new int[V];
        int pvis[]=new int[V];
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>(V);
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
        }
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(adj,i,vis,pvis))return true;
            }
        }
        return false;
    }
    
    
    boolean dfs(ArrayList<ArrayList<Integer>>adj,int node,int[] vis,int[] pvis){
        vis[node]=1;
        pvis[node]=1;
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0){
                if(dfs(adj,nbr,vis,pvis))return true;
            }
            else if(pvis[nbr]==1)return true;
        }
        
        pvis[node]=0;
        return false;
        
    }
}