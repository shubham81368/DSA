class Solution {

    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int gift : gifts) {
            queue.add(gift);
        }

        for (int i = 0; i < k; i++) {
            int curr = queue.poll();
            queue.add((int) Math.sqrt(curr));
        }

        Object[] remaining = queue.toArray();
        long result = 0;
        for (Object pile : remaining) {
            result += (int) pile;
        }

        return result;

    }

    // First attempt - brute force
    // Time: O(kn)
    // Space: O(1)
    // public long pickGifts(int[] gifts, int k) {
    //     int n = gifts.length;
    //     for (int i = 0; i < k; i++) {
    //         int max = -1;
    //         int max_index = -1;
    //         for (int j = 0; j < n; j++) {
    //             if (gifts[j] > max) {
    //                 max = gifts[j];
    //                 max_index = j;
    //             }
    //         }
    //         int remaining = (int) Math.floor(Math.sqrt(max));
    //         gifts[max_index] = remaining;
    //     }
        
    //     long result = 0;
    //     for (int gift : gifts) {
    //         result += gift;
    //     }
    //     return result;
    // }
}