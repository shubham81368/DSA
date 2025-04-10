class Solution {
    static class Pair{
    int node;
    int c;
    Pair(int node,int c){
        this.node=node;
        this.c=c;
    }
}
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        int minMst[]=new int[V];
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->(a.c-b.c));
        
        pq.add(new Pair(0,0));
        
        
        
        int sum=0;
        
         while(!pq.isEmpty()){
             Pair p=pq.poll();
             if(minMst[p.node]==1)continue;
             minMst[p.node]=1;
             sum+=p.c;
             for(int num[]:adj.get(p.node)){
                 int n=num[0];
                 int wt=num[1];
                 if(minMst[n]==0){
                     pq.add(new Pair(n,wt));
                 }
             }
         }
         
         return sum;
    }
}