class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";

        String s=countAndSay(n-1);

        //ab count karenge 
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int cnt=1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                i++;
                cnt++;
            }
            str=str+cnt+c;
        }
        return str;
    }
}