class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;

        // Get total number of unique elements in the entire array
        Set<Integer> allUnique = new HashSet<>();
        for (int num : nums) {
            allUnique.add(num);
        }
        int totalUnique = allUnique.size();

        int count = 0;

        // Use sliding window with two pointers
        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                seen.add(nums[j]);
                if (seen.size() == totalUnique) {
                    count++;
                }
            }
        }

        return count;
    }
}
