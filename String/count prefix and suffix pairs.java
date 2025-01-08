class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt=0;
        int n=words.length;
        for(int i=0;i<n;i++){
            String s=words[i];
            int len=s.length();
            for(int j=i+1;j<n;j++){
                if(i!=j &&  words[j].length()>=len){
                    if(words[j].substring(0,len).equals(s) && 
                    words[j].substring(words[j].length()-len).equals(s)){
                        cnt++;
                    }
                   
                }
            }
        }
        return cnt;
    }
}