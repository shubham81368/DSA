class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        int vis[]=new int[V];
        Stack<Integer>st=new Stack<>();
        
         for(int i=0;i<V;i++){
             if(vis[i]==0){
                 dfs(edges,i,vis,st);
             }
         }
         
         ArrayList<Integer>ans=new ArrayList<>();
         while(st.size()>0){
             ans.add(st.pop());
             
         }
         return ans;
    }
    
    
    public static void dfs(int[][] edges,int node,int[] vis,Stack<Integer>st){
          vis[node]=1;
          for(int nbr:edges[node]){
              if(vis[nbr]==0){
                  dfs(edges,nbr,vis,st);
                 
              }
          }
          st.push(node);
    }
    
}