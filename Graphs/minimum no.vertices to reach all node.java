class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] indegree=new int[n];
        for(int i=0;i<edges.size();i++){
            int u=edges.get(i).get(0);
            int v=edges.get(i).get(1);
            indegree[v]=1;//jis pe edges aa rha hai us ko true ya 1 mark kar denge
        }
        List<Integer>ans=new ArrayList<>();

         for(int i=0;i<n;i++){
            if(indegree[i]==0){
                ans.add(i);
            }
         }
         return ans;
    }
}