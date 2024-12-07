
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.maximumUniqueSubarray(arr));
        sc.close();
    }
}

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        //write code here
        int l=0;
        int r=0;
        int maxSum=0;
        int currsum=0;
        HashSet<Integer>set=new HashSet<>();
        while(r<nums.length){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                currsum-=nums[l];
                l++;
            }
            set.add(nums[r]);
            currsum+=nums[r];
            r++;
           maxSum=Math.max(maxSum,currsum);
        }
        return maxSum;
    }
};