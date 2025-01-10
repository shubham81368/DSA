class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        //first we store the freq of each character or word2 and take max of ecah char
        int freq2[]=new int[26];
        for(String s:words2){
            int temp[]=new int[26];
            for(int i=0;i<s.length();i++){
               temp[s.charAt(i)-'a']++;
         freq2[s.charAt(i)-'a']=Math.max(freq2[s.charAt(i)-'a'],temp[s.charAt(i)-'a']);
            }
        }
            List<String>ans=new ArrayList<>();
        //now store the freq to words1 ans check
        for(String word:words1){
            int temp[]=new int[26];
            for(int i=0;i<word.length();i++){
                temp[word.charAt(i)-'a']++;
            }
            //now comparing each frequency
            if(isSubset(temp,freq2)){
                ans.add(word);
            }
        }

        return ans;
    }

    boolean isSubset(int[] arr1,int[] arr2){
        for(int i=0;i<arr2.length;i++){
            if(arr1[i]<arr2[i]){
                return false;
            }
        }
        return true;
    }
}