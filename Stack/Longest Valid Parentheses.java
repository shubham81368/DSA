class Solution{
    static int maxLength(String S){
        // code here
        //we use stack for parenthesis question
        Stack<Integer>st=new Stack<>();
        //intailly we push -1 in stack;
        st.push(-1);
       int maxLen=0;
       for(int i=0;i<S.length();i++){
           if(S.charAt(i)=='('){
               st.push(i);
           }
           else{
               st.pop();
               if(st.isEmpty()){
                   
                   st.push(i);
               }{
               int currlen=i-st.peek();
               maxLen=Math.max(maxLen,currlen);
           }
           }
       }
       return maxLen;
    }
}