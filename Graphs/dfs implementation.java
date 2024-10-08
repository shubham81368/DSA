import java.util.*;

class Solution {
    public static void DFSTraversal(List<List<Integer>> edges, int n) {
        //Write your code here
        //first create adjency list
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<Integer>());
        int E=edges.size();
        for(int i=0;i<E;i++){
            int u=edges.get(i).get(0);
            int v=edges.get(i).get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        //sorting adu list each node
        for(int i=0;i<n;i++)Collections.sort(adj.get(i));
        //main dfs start
        int[] vis=new int[n];
        dfs(adj,0,vis);
        
    }
    public static void dfs(ArrayList<ArrayList<Integer>>adj,int node,int[] vis){
        //visit this node
        vis[node]=1;
        System.out.print(node+" ");
        for(Integer it: adj.get(node)){
            if(vis[it]==0)dfs(adj,it,vis);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        List<List<Integer>> ed = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(sc.nextInt());
            l.add(sc.nextInt());
            ed.add(l);
        }

        Solution ob = new Solution();
        ob.DFSTraversal(ed, n);
    }
}