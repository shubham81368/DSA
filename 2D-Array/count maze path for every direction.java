import java.util.*;

public class Main {
    static int countAllPath(int n, int m)
    {
        //Write your code here
        boolean vis[][]=new boolean[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                vis[i][j]=false;
            }
        }
        return helper(1,1,n,m,vis);
    }
 static int helper(int sr,int sc,int dr,int dc,boolean vis[][]){
    if(sr>dr || sc > dc || sr<1 || sc<1 || vis[sr][sc]==true){
        return 0;
    }
    
    if(sr==dr&& sc==dc){
        return 1;
    }

    vis[sr][sc]=true;
    //horizontal
    int horizontal=helper(sr,sc+1,dr,dc,vis);
    //left
    int left=helper(sr,sc-1,dr,dc,vis);
    //vertical
    int vertical=helper(sr+1,sc,dr,dc,vis);
    //upward
    int upward=helper(sr-1,sc,dr,dc,vis);
    //diagonally down-right
    int diagonallyDownRight=helper(sr+1,sc+1,dr,dc,vis);
    //diagonally up-left
    int diagonallyUpLeft=helper(sr-1,sc-1,dr,dc,vis);
    //diagonally down-left
    int diagonallyDownLeft=helper(sr+1,sc-1,dr,dc,vis);
    //diagonally up-right
    int diagonallyUpRight=helper(sr-1,sc+1,dr,dc,vis);
    vis[sr][sc]=false;
    return horizontal+left+upward+vertical+diagonallyDownRight+diagonallyUpLeft+diagonallyDownLeft+diagonallyUpRight;
}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        System.out.println(countAllPath(n,m));
    }
}