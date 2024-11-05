class Solution {
    public int minChanges(String s) {
        int changes=0;
        for(int i=0;i<s.length();i+=2){//becuse we are checking two character of even length at a time
           if(s.charAt(i)!=s.charAt(i+1)){
            changes++;
           }
        }
        return changes;
    }
}