class Solution {
    int[] dp=new int[50];//given string length in qus
    public int minExtraChar(String s, String[] dictionary) {
        int n=s.length();
        Arrays.fill(dp,-1);
        HashSet<String> dictionaySet=new HashSet<>(Arrays.asList(dictionary));

        return solve(s,dictionaySet,0);

    }
       
       
    public int solve(String s,HashSet<String>dic,int idx){
        if(idx==s.length())return 0;//empty string
        if(dp[idx]!=-1)return dp[idx];
        StringBuilder sb=new StringBuilder();
        int minExtraChar=s.length();
        for(int i=idx;i<s.length();i++){
            sb.append(s.charAt(i));
            int extraChar=0;
            if(!dic.contains(sb.toString())){
                extraChar=sb.length();
            }
            int curExtra=solve(s,dic,i+1);
            minExtraChar=Math.min(minExtraChar,extraChar+curExtra);
        }
        return dp[idx]=minExtraChar;
    }
}