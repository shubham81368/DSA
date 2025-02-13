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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return root;

        if(root.val<key){//means hamme node right side me hoga
           root.right=deleteNode(root.right,key);
        }
        else if(root.val>key){//means node left side me hoga
            root.left=deleteNode(root.left,key);
        }
        else{
            //means root.val==key
            //ab check karenge ki delte node leaf node to nhi hai
            if(root.left==null && root.right==null)return null;
            //ab check karenge agar ek node he hai
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                //agar dono child hai
                TreeNode node=findPredecessor(root.left);//left child me hoga
                root.val=node.val;
                root.left=deleteNode(root.left,node.val);
            }
        }
        return root;
    }

    TreeNode findPredecessor(TreeNode root){
        while(root.right!=null){
            root=root.right;
            
        }
        return root;
    }
}