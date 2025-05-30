class Solution {
    int n;
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        n=edges.length;
        int dist1[]=new int[n];
        int dist2[]=new int[n];
        Arrays.fill(dist1,Integer.MAX_VALUE);
        Arrays.fill(dist2,Integer.MAX_VALUE);
        bfs(edges,node1,dist1);
        bfs(edges,node2,dist2);
        int minDistanceNode=-1;
        int minDistanceTillNow=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int max=Math.max(dist1[i],dist2[i]);
            if(max<minDistanceTillNow){
                minDistanceTillNow=max;
                minDistanceNode=i;
            }
        }
        return minDistanceNode;
    }

    void bfs(int[] edges,int startNode,int[] dist_node){
        Queue<Integer>q=new LinkedList<>();
        q.offer(startNode);
        dist_node[startNode]=0;
        boolean[] vis=new boolean[n];
        vis[startNode]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            int v=edges[u];
            if(v!=-1 && vis[v]==false){
                vis[v]=true;
                q.offer(v);
                dist_node[v]=1+dist_node[u];
            }
        }
    }
}