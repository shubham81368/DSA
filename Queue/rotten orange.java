import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	
	  public static void main (String[] args) throws IOException {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int [][] arr= new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                arr[i][j]=sc.nextInt();
	            }
	        }
	        Solution obj= new Solution();
	        
	        System.out.println(obj.orangesRotting(arr));
		}
}

class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution{        
	 public static int orangesRotting(int[][] grid) {
//your code
     int n=grid.length;
     int m=grid[0].length;

     //take an visited array because agar ham bfs call karnege 
     //four direction me to same cell dubara aa jayega or hamm loop m fss sakte hai
     int[][] vis=new int[n][m];
     //now rooting stat from rooten orange i.e grid[i][j]==2 se
     Queue<Pair>q=new LinkedList<>();
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==2){
                q.add(new Pair(i,j,0));//jab pair me add karenge to new keyword se intilize hoga
                vis[i][j]=2;
            }
            else if(grid[i][j]==1){
                continue;
            }
            else{
                vis[i][j]=0;
            }
        }
     }

     //hamme charo direction me move karana hai 
     //to delta row && delta col array lenge
     int drow[]={-1,0,1,0};
     int dcol[]={0,1,0,-1};
     int tmax=0;//time to rotten all grid 

     while(!q.isEmpty()){
        int r=q.peek().row;
        int c=q.peek().col;
        int t=q.peek().time;
        q.remove();
        tmax=Math.max(tmax,t);
        //ab hamm charo direction me move karke fresh ko rotten karenge
        for(int i=0;i<4;i++){
            int nrow=drow[i]+r;
            int ncol=dcol[i]+c;
            if(nrow>=0 && nrow<n  && ncol>=0 && ncol<m
             && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
             {
                q.add(new Pair(nrow,ncol,t+1));
                vis[nrow][ncol]=2;
             }
        }
     }

     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(vis[i][j]!=2 && grid[i][j]==1)return -1;
        }
     }

     return tmax;
}
}
