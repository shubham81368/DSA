import java.util.*;

class Accio {
    public int longestSubsequence(int[] nums) {
       //Your code goes here
         // Map to store the length of the longest subsequence ending at each number
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        
        for (int num : nums) {
            // Get the longest subsequence that ends at num-1 (if exists) and num+1 (if exists)
            int length = Math.max(map.getOrDefault(num - 1, 0), map.getOrDefault(num + 1, 0)) + 1;
            
            // Update the length of subsequence that ends at num
            map.put(num, length);
            
            // Update the result to the maximum subsequence length found so far
            result = Math.max(result, length);
        }
        
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
    	for(int i=0;i<N;i++)
	    nums[i] = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.longestSubsequence(nums));
    }
}