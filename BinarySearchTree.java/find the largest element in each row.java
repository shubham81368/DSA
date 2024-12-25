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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new ArrayDeque<>();
       
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
             int max=Integer.MIN_VALUE;
             while(n-->0){
                TreeNode node=q.poll();
                if(max<node.val){
                    max=node.val;
                }

                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
             }
             ans.add(max);
        }

        return ans;
        
    }
}