class Solution {
    static String longestPalindrome(String s) {
        // code here
        int maxLen=0;
        int n=s.length();
        int start=-1;
        //odd
        for(int i=0;i<n;i++){
            int len=1+helper(s,i-1,i+1);
            if(len>maxLen){
            maxLen=len;
            start=i-len/2;
            }
        }
        //even
        for(int i=1;i<n;i++){
            int len=helper(s,i-1,i);
            if(len>maxLen){
            maxLen=len;
            start=i-len/2;
            }
        }
        return s.substring(start,start+maxLen);
    }
    
    
    static int helper(String s,int i,int j){
        int len=0;
        while(0<=i && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                len+=2;
                i--;
                j++;
            }
            else{
                break;
            }
        }
        return len;
    }