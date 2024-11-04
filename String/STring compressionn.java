class Solution {
    public String compressedString(String word) {
          int i=0;
        int n=word.length();
        String comp="";
        while(i<n){
            int cnt=0;
            char ch=word.charAt(i);
            while(i<n && cnt<9 && word.charAt(i)==ch){
                i++;
                cnt++;
            }
            comp=comp+cnt+ch;
        }
        return comp;
    }
}