class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int maxtillnow=values[0];
        int max=0;
        for(int i=1;i<n;i++){
            int x=values[i]-i;
            int y=maxtillnow;
            max=Math.max(max,x+y);
            maxtillnow=Math.max(maxtillnow,values[i]+i);
        }
        return max;
    }
}