import java.util.*;

class Main {
    static String[] keypad={"","ABC","DEF","GHI","JKL","MNO","PQRS","TU","VWX","YZ"};
    static ArrayList <String> OldPhone(int n, int[] keys){
		//Write your code here
        ArrayList<String>ans=new ArrayList<>();
        helper(keys,0,"",ans);
        return ans;
    }
    public static void helper(int[] keys,int i,String curr,ArrayList<String>ans){
        if(i==keys.length){
            ans.add(curr);
            return;
        }
        int currKey=keys[i];
        String key=keypad[currKey];
        for(int j=0;j<key.length();j++){
            helper(keys,i+1,curr+key.charAt(j),ans);
        }

    }
	
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for(int i=0;i<n;++i){
            keys[i] = sc.nextInt();
        }
        ArrayList <String> ans=OldPhone(n,keys);
        for(String i:ans) System.out.print(i+" ");
    }
}