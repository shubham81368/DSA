class Solution {
    //t.c->O(m*n);//m=no. of edges , n=no. of nodes 
    //s.c=o(n)//indegree store karne ke liye
    public int findChampion(int n, int[][] edges) {
        int[] indegree=new int[n];

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            indegree[v]++;
        }

        //now traverse over all node
        int champion=-1;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(indegree[i]== 0){
                champion=i;
                cnt++;
                if(cnt>1){//more then one champion
                    return -1;
                }
            }
        }
        return champion;
    }
}