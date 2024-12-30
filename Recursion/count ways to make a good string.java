class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int maxlen=high+Math.max(zero,one);
        int[] dp=new int[maxlen+1];
        Arrays.fill(dp,-1);
        return helper(low,high,zero,one,0,dp);
    }

    int helper(int low,int high,int zero,int one,int len,int[] dp){
        if(len>=high){
            dp[len]=len;
            return 0;
        }

        if(dp[len]!=-1){
            return dp[len];
        }
        int zerolen=len+zero;
        int onelen=len+one;
        int zerocnt=(zerolen>=low && zerolen<=high)?1:0;
        int onecnt=(onelen>=low&& onelen<=high)?1:0;
        int res=zerocnt+helper(low,high,zero,one,zerolen,dp)+
                onecnt+helper(low,high,zero,one,onelen,dp);
                dp[len]=res%(1000000007);
                return dp[len];
    }
}