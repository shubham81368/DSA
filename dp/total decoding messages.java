
class Solution {
    int[] dp;

    public int countWays(String digits) {
        int n = digits.length();
        dp = new int[n + 1];  // DP array size should be n + 1
        Arrays.fill(dp, -1);  // Initialize DP array with -1
        
        return helper(digits, 0, n);
    }

    public int helper(String digits, int i, int n) {
        if (i == n) return 1;  // Base case: If we've processed the entire string, return 1 (one valid way)
        
        if (digits.charAt(i) == '0') return 0;  // If the current digit is '0', no valid decoding
        
        if (dp[i] != -1) return dp[i];  // If already computed, return stored result

        // 1. Decode one digit at a time
        int one = helper(digits, i + 1, n);

        // 2. Decode two digits at a time (valid if digits[i] is '1' or '2' and digits[i+1] is between '0' and '9')
        int two = 0;
        if (i < n - 1) {  // Ensure we're not out of bounds
            int twoDigit = Integer.parseInt(digits.substring(i, i + 2));  // Form two-digit number
            if (twoDigit >= 10 && twoDigit <= 26) {
                two = helper(digits, i + 2, n);
            }
        }

        // Store the result in dp[i] and return
        return dp[i] = one + two;
    }
}
