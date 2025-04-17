   class Edge{
    int to;
    int wt;
    Edge(int to,int wt){
        this.to=to;
        this.wt=wt;
    }
    }

class Solution {

    public int findMinCycle(int V, int[][] edges) {
        // code here
        //adj list
        List<List<Edge>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            adj.get(u).add(new Edge(v,w));
            adj.get(v).add(new Edge(u,w));
        }
        
        int minCycle=Integer.MAX_VALUE;
        
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            
            int[] dist=dijkstra(adj,V,u,u,v);
            
            if(dist[v]!=Integer.MAX_VALUE){
                minCycle=Math.min(minCycle,dist[v]+w);
            }
        }
        
        return (minCycle==Integer.MAX_VALUE)?-1:minCycle;
    }
    
    int[] dijkstra(List<List<Edge>>adj,int V,int start,int skipu,int skipv){
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start]=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[1]-b[1]));
        
        pq.add(new int[]{start,0});
        
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int node=curr[0];
            int currDist=curr[1];
            if(currDist>dist[node])continue;
            for(Edge e:adj.get(node)){
                int nbr=e.to;
                int w=e.wt;
                if((node==skipu && nbr==skipv) || (nbr==skipu && node==skipv))continue;
                if(dist[node]+w<dist[nbr]){
                    dist[nbr]=w+dist[node];
                    pq.add(new int[]{nbr,dist[nbr]});
                }
            }
        }
        return dist;
    }
};