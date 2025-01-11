class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        if(n<k)return false;
        if(n==k)return true;
        //ab count karne ke liye freq calculate karenge
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }

        //no of character cnt karenge jinki freq odd hai
        int oddcnt=0;
        for(int i=0;i<26;i++){
              if(freq[i]%2==1)oddcnt++;
        }

        return oddcnt<=k;
    }
}