class Solution {
    public boolean isCircularSentence(String sentence) {
        String word[]=sentence.split(" ");
        String s=word[0];
        if(word.length==1){
           if( s.charAt(0)!=s.charAt(s.length()-1))return false;
        }
        for(int i=1;i<word.length;i++){
            if(s.charAt(s.length()-1)!=word[i].charAt(0)){
                return false;
            }
            s=word[i];
            
        }
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1))return false;
        
        return true;
    }
}