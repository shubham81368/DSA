import java.util.*;

class Solution {
    public boolean CanVisitAllRooms(ArrayList<ArrayList<Integer>> rooms) {
        // Write your code here
        int n=rooms.size();
        int[] vis=new int[n];

        dfs(rooms,0,vis);

        for(int i=0;i<n;i++){
            if(vis[i]==0)return false;
        }
           return true;
    }

    public void dfs(ArrayList<ArrayList<Integer>>rooms,int i,int[] vis){
        vis[i]=1;
        for(int room:rooms.get(i)){
            if(vis[room]==0){
                dfs(rooms,room,vis);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j < m; j++) {
                temp.add(sc.nextInt());
            }
            r.add(temp);
        }
	    Solution Obj = new Solution();
        if(Obj.CanVisitAllRooms(r))
            System.out.println("true");
        else
            System.out.println("false");
    }
}