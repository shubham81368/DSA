import java.io.*;
import java.util.*;
class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(read.readLine());
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<N; i++)
        {
            String S[] = read.readLine().split(" ");
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<N; j++)
                temp.add(Integer.parseInt(S[j]));
            adj.add(temp);
        }

        Solution ob = new Solution();
        System.out.println(ob.components(adj,N));
    }
}

class Solution {
    int components(ArrayList<ArrayList<Integer>> adj, int N) {
        
       //Your code here
       int[] vis=new int[N];
       int component=0;
       for(int i=0;i<N;i++){
        if(vis[i]==0){
            dfs(i,adj,vis);
            component++;
        }
       }
       return component;
    }

    public void dfs(int node,ArrayList<ArrayList<Integer>>adj,int[] vis){
        vis[node]=1;
    
             // Traverse all the neighbors of the current node
        for (int i = 0; i < adj.size(); i++) {
            if (adj.get(node).get(i) == 1 && vis[i] == 0) {  // If there's an edge and the neighbor is unvisited
                dfs(i, adj, vis);  // Recursively visit the neighbor
            }
        }

    }
};