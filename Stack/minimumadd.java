class Solution {
    public int minAddToMakeValid(String s) {
         Stack<Character>st=new Stack<>();
         int close=0;
         for(char c:s.toCharArray()){
            if(c=='(')st.push(c);
            else if(!st.isEmpty())st.pop();
            else {
                close++;
            }
         }
         if(close!=0){
            return close+st.size();
         }
         return st.size();
    }
}