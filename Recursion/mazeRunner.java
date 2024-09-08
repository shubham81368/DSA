import java.util.*;

class Solution{
    static ArrayList <String> MazeRunner(int n,int m){
        //write code here
        ArrayList<String>ans=new ArrayList<>();
        helper(0,0,n,m,"",ans);
        return ans;
    }
    public static void helper(int r,int c,int n,int m,String s,ArrayList<String>ans){
        if(r==n-1&&c==m-1){
            ans.add(s);
            return;
        }
        if(c+1<m){
            helper(r,c+1,n,m,s+"H",ans);
        }
        if(r+1<n){
            helper(r+1,c,n,m,s+"V",ans);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Solution obj = new Solution();
        ArrayList <String> ans=obj.MazeRunner(n,m);
        Collections.sort(ans);
        for(String i:ans) System.out.print(i+" ");
    }
}