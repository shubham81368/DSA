class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int cnt=0;
        int left=0;
        for(int right=1;right<(n+k-1);right++){
            //skip 
            if(colors[right%n]==colors[(right-1)%n]){
                left=right;
            }
            if(right-left+1==k){
                cnt++;
                left++;
            }
        }
        return cnt;
    }
}