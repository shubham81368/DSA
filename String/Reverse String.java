class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] word=str.split("\\.");
        int i=word.length-1;
        str="";
        while(i>=0){
            if(i==0){
                str+=word[i];
            }
            else{
                str+=word[i]+".";
            }
            i--;
        }
        return str;
    }
}