class Solution {
    public int findMissing(int[] arr) {
        // code here
        int n = arr.length;
        int diff = (arr[1] - arr[0]) ; // Use n, not n-1

        for (int i = 1; i < n ; i++) {
            if (arr[i - 1] +diff!= arr[i]) {
                return arr[i-1] + diff;
            }
        }

        // If all elements matched the diff, missing element is at the end
        return arr[n - 1] + diff;

    }
}