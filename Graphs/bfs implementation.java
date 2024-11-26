import java.util.*;
import java.io.*;
 
class Graph {
    public int vertices;
    public ArrayList<Integer>[] adjList;
 
    Graph(int v) {
        this.vertices = v+1;
        adjList = new ArrayList[v+1];
        
        for (int i = 0; i <= v; i++) adjList[i] = new ArrayList<Integer>();
    }
 
    void addEdge(int v, int w) {
        adjList[v].add(w);
     
    }
 
    void BFS(int x) {
        // your code here
        Queue<Integer>q=new LinkedList<>();
        int vis[]=new int[vertices];
        q.add(x);
        vis[x]=1;
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            //adjacency list pe traver karenge
            for(int it:adjList[node]){
               if(vis[it]==0){
                q.add(it);
                vis[it]=1;
               }
            }
        }
    }
}
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(110);
        for(int i =0;i<e;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g.addEdge(x,y);
        }
        g.BFS(0);
    }
}
