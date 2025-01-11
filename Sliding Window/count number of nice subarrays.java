import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        // Read inputs
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        obj.solve(nums, n, k);
    }
}

class Solution {
    
    // Helper function to count subarrays with at most k odd numbers
    static int countAtMostKOddNumbers(int[] nums, int k) {
        int start = 0, oddCount = 0, subarrayCount = 0;
        
        for (int end = 0; end < nums.length; end++) {
            // If nums[end] is odd, increment oddCount
            if (nums[end] % 2 != 0) {
                oddCount++;
            }
            
            // Shrink the window from the left if oddCount exceeds k
            while (oddCount > k) {
                if (nums[start] % 2 != 0) {
                    oddCount--;
                }
                start++;
            }
            
            // Count all valid subarrays that end at 'end'
            subarrayCount += (end - start + 1);
        }
        
        return subarrayCount;
    }
    
    // Main function to solve the problem
    static void solve(int[] nums, int n, int k) {
        // Count subarrays with at most k odd numbers
        int atMostK = countAtMostKOddNumbers(nums, k);
        
        // Count subarrays with at most k-1 odd numbers
        int atMostKMinus1 = countAtMostKOddNumbers(nums, k - 1);
        
        // The result is the difference between the two counts
        System.out.println(atMostK - atMostKMinus1);
    }
}
