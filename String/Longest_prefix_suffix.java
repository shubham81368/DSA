class Solution {
    int lps(String str) {
        // code here
        int[] lps=new int[str.length()];
        Arrays.fill(lps,0);
        
        //intially
        int i=1,j=0;
        while(i<str.length()){
            if(str.charAt(i)==str.charAt(j)){
                lps[i]=j+1;
                i++;
                j++;
            }
            else{//if the characters are not equal
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return lps[str.length()-1];
    }
}