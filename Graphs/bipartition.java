import java.util.*;

class Solution {

    public boolean dfs(ArrayList<ArrayList<Integer>>adj,int node,int []vis,int c){
        vis[node]=c;
        for(Integer it: adj.get(node)){
            //dfs call
            if(vis[it]==0){
            if(dfs(adj,it,vis,-1*c)==false)return false;
            
        }
        else{
            //adj node has same color as us
            if(vis[it]==c)return false;
        }
    }
    return true;
    }
    public int possibleBipartition(int n, int[][] dislikes) {
        // Write your code here
        //edge list
        //adj list
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++)adj.add(new ArrayList<Integer>());

        //adj list banana hai
        for(int i=0;i<dislikes.length;i++){
            int u=dislikes[i][0];
            int v=dislikes[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int []vis=new int[n+1];
        for(int i=1;i<=n;i++){
            if(vis[i]==0){
                if(dfs(adj,i,vis,1)==false)return 0;
            }
        }
        return 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();

        int dislike[][] = new int[M][2];

        for(int i=0; i<M; i++){
            for(int j=0; j<2; j++)
                dislike[i][j]= sc.nextInt();
        }
        
        Solution Obj = new Solution();
        System.out.println(Obj.possibleBipartition(N,dislike));

    }
}