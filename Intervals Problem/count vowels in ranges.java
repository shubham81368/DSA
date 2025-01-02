class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int m=queries.length;

        //prefix array me number or vowel waale cont store karen vo bhi cumulative way me

          int psum[]=new int[n];
          for(int i=0;i<n;i++){
                String s=words[i];
                if((s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'
                ||s.charAt(0)=='o'||s.charAt(0)=='u')&&(s.charAt(s.length()-1)=='a'
                ||s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='e'
                ||s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='u')){
                    psum[i]+=1+(i>0?psum[i-1]:0);
                }
                else{
                     psum[i]+=(i>0?psum[i-1]:0);
                }

          }
        
        int ans[]=new int[m];
        for(int j=0;j<m;j++){
            int start=queries[j][0];
            int end=queries[j][1];
           
              ans[j]=psum[end]-(start>0?psum[start-1]:0);
        }
        return ans;
    }
}