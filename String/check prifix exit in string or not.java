class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int m=searchWord.length();
        String word[]=sentence.split(" ");
        for(int i=0;i<word.length;i++){
            if(word[i].length()>=m){
              if( word[i].substring(0,m).equals(searchWord))return i+1;
            }
        }

        return -1;
    }
}