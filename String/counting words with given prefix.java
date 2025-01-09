class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            String s=words[i];
            if(s.length()>=pref.length()){
                if(s.substring(0,pref.length()).equals(pref)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}