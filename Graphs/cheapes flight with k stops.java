import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int arr[][] = new int[e][3];
        for (int i = 0; i < e; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        int src = sc.nextInt();
        int dst = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        int ans = Obj.findCheapestPrice(n, arr, src, dst, k);
        System.out.println(ans);
        sc.close();
    }
}
class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

class Triple{
    int first;
    int second;
    int third;
    public Triple(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //write code here
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        //create adj list in which we store pair first value destination and second cost
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int m=flights.length;
        for(int i=0;i<m;i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        //create a queue which stores the node and their distance 
        //from source in the form of {stops,{node,cost}}

        Queue<Triple>q=new LinkedList<>();
        
        q.add(new Triple(0,src,0));
        dist[src]=0;

        while(!q.isEmpty()){
            Triple it=q.poll();
            int stops=it.first;
            int node=it.second;
            int cost=it.third;
            if(stops>k)continue;
            for(Pair nbr:adj.get(node)){
                int nbrNode=nbr.first;
                int nbrW=nbr.second;
               
               if(nbrW+cost<dist[nbrNode]&& stops<=k){
                dist[nbrNode]=nbrW+cost;
                q.add(new Triple(stops+1,nbrNode,nbrW+cost));
               }
            } 
        }
              if(dist[dst]==Integer.MAX_VALUE)return -1;

              return dist[dst];
    }
}