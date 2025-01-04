class Solution {
    public int countPalindromicSubsequence(String s) {
       Set<Character>set=new HashSet<>();
       int n=s.length();
       int cnt=0;
       for(int i=0;i<n;i++){
        set.add(s.charAt(i));
       }

       for(char c:set){
          int first=-1;
          int last=-1;
          for(int i=0;i<n;i++){
            if(c==s.charAt(i)){
                if(first==-1){
                    first=i;
                }
                last=i;
            }}
            if(first==last)continue;
            Set<Character>set1=new HashSet<>();
            for(int i=first+1;i<last;i++){
              set1.add(s.charAt(i));
            }
            cnt+=set1.size();
          
       }
       return cnt;
    }
}