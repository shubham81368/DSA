import java.util.Arrays;

class Solution {
    String minSum(int[] arr) {
        // Edge case: if the array is empty or has all zeros
        if (arr == null || arr.length == 0) {
            return "0";
        }

        // Sort the array to ensure digits are in ascending order
        Arrays.sort(arr);
        
        // Using StringBuilder for efficient string construction
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        // Distribute digits between num1 and num2 alternately
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                num1.append(arr[i]);
            } else {
                num2.append(arr[i]);
            }
        }
        
        // Add the two numbers represented by num1 and num2
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // Add the digits from both num1 and num2 from the right to the left
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += num1.charAt(i) - '0';  // Convert char to int
                i--;
            }
            
            if (j >= 0) {
                sum += num2.charAt(j) - '0';  // Convert char to int
                j--;
            }
            
            ans.append(sum % 10);  // Append the last digit of sum
            carry = sum / 10;      // Update carry
        }

        // Reverse the result to get the correct order
        ans.reverse();
        
        // Remove leading zeros (if any)
        int start = 0;
        while (start < ans.length() && ans.charAt(start) == '0') {
            start++;
        }
        
        return start == ans.length() ? "0" : ans.substring(start).toString();
    }
}
