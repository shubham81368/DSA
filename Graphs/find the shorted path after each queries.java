class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        //first create adjacency list
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        //ab adj list fill karenge
        for(int i=0;i<n-1;i++){
            int u=i;
            int v=i+1;
            adj.get(u).add(v);
        }

        //now traverse karnege queries par shortest path find start to end node;
        int[] res=new int[queries.length];
        int i=0;
        for(int[] querie:queries){
            int u=querie[0];
            int v=querie[1];
            adj.get(u).add(v);
            int d=bfs(n,adj);
            
            res[i++]=d;
        }

        return res;
    }

    int bfs(int v,ArrayList<ArrayList<Integer>>adj){
        Queue<Integer>q=new LinkedList<>();
        q.add(0);//start node add
        //we created visited array bcz ek node ko baar baar traverse na kare
        int[] vis=new int[v];
        vis[0]=1;
        int level=0;
        while(!q.isEmpty()){
            int n=q.size();
            while(n-->0){
                int node=q.poll();
                if(node==v-1){//reached to destination
                  return level;
                }
                //ab ham uske neighbour pe traverse karenge
                for(int it:adj.get(node)){
                    if(vis[it]==0){
                        q.add(it);
                        vis[it]=1;
                    }
                }
            }
                  level++;
                }
                return -1;//koi bhi path nhi hai destination tak jane ka
            
        
    }
}