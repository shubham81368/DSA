class Solution {
    public String makeFancyString(String s) {
        StringBuilder str=new StringBuilder();
        str.append(s.charAt(0));
        int cnt=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                str.append(s.charAt(i));
                cnt=1;
            }
            else if(s.charAt(i)==(s.charAt(i-1))&&cnt+1<3){
                str.append(s.charAt(i));
                cnt++;
            }
        }
        return str.toString();
    }
}