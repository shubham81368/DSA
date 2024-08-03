import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        //Write code here
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        int result=0;
        while(s<e){
            if(nums[s]+nums[e]>k){
                e--;
            }
            else if(nums[s]+nums[e]<k){
                s++;
            }else{
                s++;
                e--;
                result++;
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k;
        k = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.maxOperations(arr, k);
        System.out.println(result);
        sc.close();
    }
}