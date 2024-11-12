
class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        int n=arr.length;
        
        int startTime=arr[0][0];
        int endTime=arr[0][1];
        
        Arrays.sort(arr,(a,b)->a[1]-b[1]);//sort according to second value
        
        for(int i=1;i<n;i++){
            startTime=arr[i][0];
            if(endTime>startTime)return false;
            endTime=arr[i][1];
        }
        return true;
    }
}