import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public boolean splitOdd10(int[] nums) {
        // your code here
           return   helper(nums,0,0,0);
}

public boolean helper(int[] nums,int i,int sum1,int sum2){
    if(i==nums.length){
        return (sum1%10==0 && sum2%2==1)||(sum1%2==1&&sum2%10==0);
    }

    if(helper(nums,i+1,sum1+nums[i],sum2))return true;

    if(helper(nums,i+1,sum1,sum2+nums[i]))return true;

    return false;
}

}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[]=new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        Solution obj=new Solution();

        if(obj.splitOdd10(arr))
         System.out.println("YES");
         else
         System.out.println("NO");
    }
}