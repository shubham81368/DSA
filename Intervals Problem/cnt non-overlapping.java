class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        int n=intervals.length;
    Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    int p=-1,cnt=0;
    for(int i[]:intervals){
        if(i[0]<p){
            cnt++;
            p=Math.min(p,i[1]);
        }
        else{
            p=i[1];
        }
    }
    return cnt;
    }
}