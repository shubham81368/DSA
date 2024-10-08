import java.util.Stack;

class Solution {
    public int minSwaps(String s) {
        int size=0;
        
        // Loop through the characters in the string
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
              size++;
            } else if (size>0) {
                size--;  // Pop for a matching closing bracket
            }
            // If it's a closing bracket and stack is empty, ignore it
        }
        
        // Each unmatched pair of parentheses requires one swap
        int swaps = (size + 1) / 2;
        return swaps;
    }
}
