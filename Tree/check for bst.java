
class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        if(root==null)return true;
        ArrayList<Integer>ans=new ArrayList<>();
        helper(root,ans);
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)>ans.get(i+1))return false;
        }
        return true;
    }
    
    void helper(Node root,ArrayList<Integer>ans){
        if(root==null)return ;
        
        helper(root.left,ans);
        ans.add(root.data);
        helper(root.right,ans);
    }
}