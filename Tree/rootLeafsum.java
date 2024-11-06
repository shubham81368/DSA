class Solution {
    public static int treePathsSum(Node root) {
        // add code here.
       return preOrder(root,0);//intially parent sum is 0;
        
    }
    //tc=o(n);
    //s.c=o(N);//stack space mean height of tree;
    public static int preOrder(Node root,int x){
        if(root==null)return 0;
        x=x*10+root.data;
        if(root.left==null && root.right==null)return x;
        
        return preOrder(root.left,x)+preOrder(root.right,x);
    }
}