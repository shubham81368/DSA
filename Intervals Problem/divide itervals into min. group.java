class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){//O(n)
            min=Math.min(min,intervals[i][0]);
            max=Math.max(max,intervals[i][1]);
        }

        int eventCount[]=new int[max+2];//s.c=o(max+2)
        //find the count;
        for(int i=0;i<n;i++){
            eventCount[intervals[i][0]]++;//start ko +1 denge
            eventCount[intervals[i][1]+1]--;//end ka count ek end jada wala ko -1 denge
        }
        int maxOverlap=0;
        int sum=0;//we calculate prefix sum here
        for(int i=min;i<max+2;i++){
            sum+=eventCount[i];
            maxOverlap=Math.max(maxOverlap,sum);
        }

        return maxOverlap;
    }
}