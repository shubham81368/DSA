import java.util.*;

class Solution {
    public ArrayList<Integer> SubsetSums(ArrayList<Integer> arr) {
        // Write your code here
          ArrayList<Integer>ans=new ArrayList<>();
          helper(arr,0,0,ans);
          return ans;
    }

    public void helper(ArrayList<Integer>arr,int i,int sum,ArrayList<Integer>ans){
        if(i==arr.size()){
            ans.add(sum);
            return;
        }
        helper(arr,i+1,sum+arr.get(i),ans);
        helper(arr,i+1,sum,ans);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
            arr.add(sc.nextInt());
	    Solution Obj = new Solution();
        ArrayList<Integer> ans = Obj.SubsetSums(arr);
        Collections.sort(ans);
        for(int a : ans)
            System.out.print(a+" ");

    }
}