class Solution {
    public boolean rotateString(String s, String goal) {
       

        String str="";

        for(int i=0;i<s.length();i++){
            str=(s.substring(i,s.length())+s.substring(0,i));
            
            if(str.equals(goal))return true;
        }
        return false;
    }
}