import java.io.*;
import java.util.*;
  class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
class Solution{
    public static int perfectStudents(int vtces,  ArrayList<Edge>[] graph){
       // Your code here
       boolean vis[]=new boolean[vtces];
       ArrayList<ArrayList<Integer>>comps=new ArrayList<>();
       for(int i=0;i<vtces;i++){
         if(vis[i]==false){
            ArrayList<Integer>comp=new ArrayList<>();
            dfs(graph,i,vis,comp);
            comps.add(comp);
         }
       }
       int pairs=0;
       for(int i=0;i<comps.size();i++){
         for(int j=i+1;j<comps.size();j++){
            int count=comps.get(i).size()*comps.get(j).size();
            pairs+=count;
         }
       }
       return pairs;
   }

   public static void dfs(ArrayList<Edge>[] graph,int i,boolean[] vis,ArrayList<Integer>comp ){
      vis[i]=true;
      comp.add(i);
      for(Edge e:graph[i]){
          if(vis[e.nbr]==false){
            dfs(graph,e.nbr,vis,comp);
          }
      }
   }
}
public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      int vtces = n;
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = k;
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }
      System.out.println(Solution.perfectStudents(n, graph));
   }

}