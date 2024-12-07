import java.util.*;

class Solution{
    public int numRabbits(int[] answers) {
        // write code here
        HashSet<Integer>set=new HashSet<>();
        for(int num:answers)set.add(num);

        int ans=0;
        for(int num:set){
            ans+=num+1;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj =  new Solution();
        System.out.println(Obj.numRabbits(arr));
    }
}
