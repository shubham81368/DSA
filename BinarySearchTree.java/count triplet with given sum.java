   public int countTriplets(int[] arr, int target) {
        // Code Here
                int count = 0;
        int n = arr.length;

        // Iterate through each element of the array as the first element of the triplet
        for (int i = 0; i < n - 2; i++) {
            int s = i + 1;  // left pointer
            int e = n - 1;  // right pointer

            // Use the two-pointer approach to find the other two elements
            while (s < e) {
                long sum = (long) arr[i] + arr[s] + arr[e]; // to avoid overflow

                if (sum == target) {
                      // found a valid triplet
                      int leftCount = s+1;
                
                    while (leftCount < e && arr[leftCount] == arr[leftCount -1]) {
                        count++;
                        leftCount++;
                    }
               
                    count++;
                        // move the left pointer to the right
                    e--;     // move the right pointer to the left
                } else if (sum < target) {
                    s++;  // increase the sum by moving the left pointer to the right
                } else {
                    e--;  // decrease the sum by moving the right pointer to the left
                }
            }
        }

        return count;  // return the total number of valid triplets

    }