import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<String> allPossiblePaths(int n, int m) {
        // write code here
        ArrayList<String>ans=new ArrayList<>();
        
        helper(0,0,n-1,m-1,"",ans);
        return ans;
    }

    static void helper(int sr,int sc,int dr,int dc,String psf,ArrayList<String>ans){
        if(sr==dr && sc==dc){
            ans.add(psf);
            return;
        }

        if(sr>dr || sc>dc){
            return;
        }

        //1 step horizontal
            helper(sr,sc+1,dr,dc,psf+"h"+1,ans);
        //2 step horizontal
            helper(sr,sc+2,dr,dc,psf+"h"+2,ans);
    

        //1 step vertical
            helper(sr+1,sc,dr,dc,psf+"v"+1,ans);
        //2 step vertical
           helper(sr+2,sc,dr,dc,psf+"v"+2,ans);
        
        ///1 step vertical
            helper(sr+1,sc+1,dr,dc,psf+"d"+1,ans);
        // 2 step vertica;
            helper(sr+2,sc+2,dr,dc,psf+"d"+2,ans);
    
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }

    }
}
