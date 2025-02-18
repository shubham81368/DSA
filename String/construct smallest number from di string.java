class Solution {
    public String smallestNumber(String pattern) {
        String s="";
        Stack<Character>st=new Stack<>();
        int cnt=1;
        for(int i=0;i<=pattern.length();i++){
           st.push((char)(cnt+'0'));
           if(i==pattern.length()|| pattern.charAt(i)=='I'){
           while(!st.isEmpty()){
            s+=st.pop();
           }}

           
           cnt++;
        }
      return s;
    }
}