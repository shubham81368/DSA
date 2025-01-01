class Solution {
    public int maxScore(String s) {
        int zero=0;
        int ones=0;
        int max=0;
        int n=s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }
            ones=0;
           for(int j=i+1;j<n;j++){
            if(s.charAt(j)=='1'){
                ones++;
            }

           }
           max=Math.max(max,zero+ones);
        }
        return max;
    }
}