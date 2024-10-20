class Solution {
    public boolean parseBoolExpr(String expression) {
        int n=expression.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=expression.charAt(i);
            if(ch==')'){
                ArrayList<Character>arr=new ArrayList<>();
                while(st.peek()!='('){
                    arr.add(st.pop());
                }
                st.pop();
                char op=st.pop();
                st.push(solve(arr,op));
            }
            else if(ch==','){
                continue;
            }
            else{
                st.push(ch);
            }
        }
        return st.peek()=='t'?true:false;
    }

    public char solve(ArrayList<Character>arr,char op){
        if(op=='!'){
            return arr.get(0)=='f'?'t':'f';
        }
        if(op=='&'){
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)=='f')
                return 'f';
            }
            return 't';
        }
        if(op=='|'){
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)=='t'){
                    return 't';
                }
            }
            return 'f';
        }
        return 't';
    }
}