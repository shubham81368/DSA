import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
public boolean isCyclic(int V, ArrayList<Integer>[] adj) {
    // Your code here
      int vis[]=new int[V];
      int pvis[]=new  int[V];
      for(int i=0;i<V;i++){
        if( vis[i]==0 && dfs(i,adj,vis,pvis,-1))return true;
      }
      return false;
   }

   boolean dfs(int node,ArrayList<Integer>[] adj,int vis[] ,int pvis[],int p){
      vis[node]=1;
      pvis[node]=1;
      //traverse karenge adj Array
      for(int it:adj[node]){
        if(vis[it]==0){
            if(dfs(it,adj,vis,pvis,node)){
                return true;
            }
        }
        else{
            //means already visited 
            //now check karenge parent not equal to node and path visited
            if(pvis[it]==1 && it!=p)return true;
        }
      }
      pvis[node]=0;
      return false;
   }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < E; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            adj[u].add(v);
        }
        Solution obj = new Solution();
        boolean ans = obj.isCyclic(V, adj);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}