class Solution {
    int dp[][];

    public int editDistance(String s1, String s2) {
        dp = new int[s1.length() + 1][s2.length() + 1];
        
        // Initialize the dp array with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return helper(s1, s2, 0, 0);
    }
    
    int helper(String s1, String s2, int i, int j) {
        // Base cases
        if (i == s1.length()) {
            return s2.length() - j;  // Remaining characters in s2
        }
        
        if (j == s2.length()) {
            return s1.length() - i;  // Remaining characters in s1
        }
        
        // If the value is already calculated, return it
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int ans = 0;

        if (s1.charAt(i) == s2.charAt(j)) {
            // No operation needed if characters are the same
            ans = helper(s1, s2, i + 1, j + 1);
        } else {
            // Perform operations: Insert, Delete, or Replace
            int insert = 1 + helper(s1, s2, i, j + 1);  // Insert
            int delete = 1 + helper(s1, s2, i + 1, j);  // Delete
            int replace = 1 + helper(s1, s2, i + 1, j + 1);  // Replace

            // Take the minimum of the three possible operations
            ans = Math.min(insert, Math.min(delete, replace));
        }

        // Memoize the result for this state
        dp[i][j] = ans;
        
        return ans;
    }
}
