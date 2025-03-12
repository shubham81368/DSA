import java.io.*;
import java.util.*;

class Solution{
    public int minCandies(int arr[]) {
        int n = arr.length;
        int[] cnt = new int[n];
        Arrays.fill(cnt, 1); // Initially, every child gets at least 1 candy
        
        // Left to right pass to ensure the increasing sequence is handled
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                cnt[i] = cnt[i - 1] + 1;
            }
        }

        // Right to left pass to handle the decreasing sequence
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                cnt[i] = Math.max(cnt[i], cnt[i + 1] + 1);
            }
        }

        // Sum up all the candies
        int totalCandies = 0;
        for (int val : cnt) {
            totalCandies += val;
        }

        return totalCandies;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.minCandies(a));
    }
}
