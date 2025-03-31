class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length;
        int m=n-1;
        int psum[]=new int[m];
        for(int i=0;i<m;i++){
            psum[i]=weights[i]+weights[i+1];
        }
        Arrays.sort(psum);
        long minSum=0;
        long maxSum=0;
        for(int i=0;i<k-1;i++){
            minSum+=psum[i];
            maxSum+=psum[m-i-1];
        }

        return maxSum-minSum;
    }
}