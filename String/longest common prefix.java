class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        int index=0;
            while(true){
                if(strs[0].length()<=index)return s;
            char c=strs[0].charAt(index);
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()<=index || (strs[j].charAt(index)!=c))return s;

            }
            s+=c;
            index++;
        }
          
    }
}