class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>st=new Stack();
        int n=preorder.length;
        for(int i=0;i<n;i++){
            if(st.isEmpty() || st.peek()>=preorder[i]){
                st.push(preorder[i]);
            }
            else{
                int temp=st.peek();
                int cnt=0;
                    while(!st.isEmpty() && st.peek()<preorder[i]){
                        cnt++;
                        st.pop();
                    
                }
                if(cnt>=2){
                    res.add(temp);
                }
                st.push(preorder[i]);
            }
        }
        res.add(st.peek());
        return res;
    }
    

}