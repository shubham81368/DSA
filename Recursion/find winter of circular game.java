import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int findTheWinner(int n, int k) {
        // Your code here
        int ans=helper(n,k)+1;
        return ans;
    }

    public int helper(int n,int k){
        if(n==1)return 0;
        //because n ke se mod karenge to zero aa jayega or
        // isliye ans me 1 add kiya hai
        return (helper(n-1,k)+k)%n;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        Solution Obj = new Solution();
        int ans = Obj.findTheWinner(n,k);
        System.out.println(ans);
    }
}