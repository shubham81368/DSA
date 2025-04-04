/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int depth;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        depth=0;
        HashMap<TreeNode,Integer>mp=new HashMap<>();
        helper(root,mp,0);
        return lca(root,mp);

    }

    public void helper(TreeNode root,HashMap<TreeNode,Integer>mp,int d){
        if(root==null)return ;
        depth=Math.max(depth,d);
        mp.put(root,d);
        helper(root.left,mp,d+1);
        helper(root.right,mp,d+1);
    }

    public TreeNode lca(TreeNode root,HashMap<TreeNode,Integer>mp){
        if(root==null || mp.get(root)==depth)return root;

        TreeNode lst=lca(root.left,mp);
        TreeNode rst=lca(root.right,mp);

        if(lst!=null && rst!=null)return root;

        return lst!=null?lst:rst;
    }
}