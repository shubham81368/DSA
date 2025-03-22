import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	static int dp[];
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n=nums.size();
          dp=new int[n];
		  for(int i=0;i<n;i++){
			  dp[i]=-1;
		  }
		  return helper(nums,0,n);
	}

	public static int helper(ArrayList<Integer>num,int i,int n){
		if(i>=n)return 0;
		if(dp[i]!=-1)return dp[i];
		int take=num.get(i)+helper(num,i+2,n);
		int not_take=helper(num,i+1,n);
		return dp[i]=Math.max(take,not_take);
	}
}