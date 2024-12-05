import java.util.*;

class Solution {
    public String SmallestSubstring(String a, String b) {
        // Write your code here
           // Step 1: Initialize variables
int n = a.length();  // Length of string a
int m = b.length();  // Length of string b
if (m > n) return "-1";  // If b is longer than a, return an empty string

HashMap<Character, Integer> mp = new HashMap<>();
for (char ch : b.toCharArray()) {  // Step 2: Track characters of b in a frequency map
    mp.put(ch, mp.getOrDefault(ch, 0) + 1);
}

int requiredcnt = m;  // This will track how many characters from b are needed

int i = 0, j = 0;
int minWindowsize = Integer.MAX_VALUE;
int start_i = 0;

// Step 3: Sliding window approach
while (j < n) {
    char ch = a.charAt(j);
    if (mp.containsKey(ch) && mp.get(ch) > 0) {
        requiredcnt--;
    }
    mp.put(ch, mp.getOrDefault(ch, 0) - 1);

    // Step 4: Shrink the window when we have all characters from b
    while (requiredcnt == 0) {
        int len = j - i + 1;
        if (len < minWindowsize) {
            minWindowsize = len;
            start_i = i;
        }

        // Shrink the window from the left
        char c = a.charAt(i);
        mp.put(c, mp.getOrDefault(c, 0) + 1);
        if (mp.containsKey(c) && mp.get(c) > 0) {
            requiredcnt++;
        }
        i++;
    }
    j++;
}

// Step 5: Return the smallest valid window, or empty string if no such window
return minWindowsize == Integer.MAX_VALUE ? "-1" : a.substring(start_i, start_i + minWindowsize);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
	    Solution Obj = new Solution();
        System.out.println(Obj.SmallestSubstring(a, b));
    }
}