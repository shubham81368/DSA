class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c[]=new int[26];//take space of 25 character

        //here we inserting one to each character which are present in string allowed
        for(int i=0;i<allowed.length();i++){
            c[allowed.charAt(i)-'a']=1;
        }

        //now we check whether each character is present int the allowed string or not
        int cnt=0; //to count no. of present in allowed
        for(int i=0;i<words.length;i++){
            String s=words[i];
            boolean flag=false;
            for(int j=0;j<s.length();j++){
                if(c[s.charAt(j)-'a']==0){
                    flag =true;
                    break;
                }
            }
            if(flag==false){
                cnt++;
            }
        }
        return cnt;
    }
}