class Solution {
    int countLeaves(Node node) {
        // Your code
        if(node==null)return 0;
        if(node.left==null && node.right==null)return 1;
        int left=countLeaves(node.left);
        int right=countLeaves(node.right);
        return left+right;
    }
    
  
}