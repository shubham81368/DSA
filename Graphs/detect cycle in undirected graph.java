import java.io.*;
import java.util.*;

class Solution {
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       // Your code here
     
          int vis[]=new int[V];
       for(int i=0;i<V;i++){ 
          if(vis[i]==0 && dfs(i,adj,vis,-1))return true;
       }

       return false;
    }

   static boolean dfs(int node,ArrayList<ArrayList<Integer>>adj,int[] vis,int p){
        vis[node]=1;

        //now traverse on their adjacency ArrayList
        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(dfs(it,adj,vis,node)){
                    return true;
                }}
                else{
                    if(p!=it)return true;
                }
            
        }

        return false;
    }
}

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N, E;
        N = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<N; i++) adj.add(i, new ArrayList<Integer>());    
        for(int i =0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean ans = Solution.isCycle(N,adj);
        if(ans)
            System.out.println("1");
        else
            System.out.println("0");
    }
}