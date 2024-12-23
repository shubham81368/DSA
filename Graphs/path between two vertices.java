import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        int U=sc.nextInt();
        int V=sc.nextInt();
        Solution ob = new Solution();
        if (ob.check(N, M, Edges,U,V)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

}

class Solution {
    
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges,int U,int V) {
        // your code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<=N;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<M;i++){
            int u=Edges.get(i).get(0);
            int v=Edges.get(i).get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis=new boolean[N+1];
       return dfs(adj,vis,U,V)?true:false;
    }

    boolean dfs(ArrayList<ArrayList<Integer>>adj,boolean[] vis,int currNode,int dest){
        
        vis[currNode]=true;
        if(currNode==dest){
            return true;
        }

        for(int nbr:adj.get(currNode)){
            if(vis[nbr]==false){
                if(dfs(adj,vis,nbr,dest)){
                    return true;
                }
           
            }
        }
        return false;
    }
}