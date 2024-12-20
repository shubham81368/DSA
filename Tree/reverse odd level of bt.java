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
    public TreeNode reverseOddLevels(TreeNode root) {
        // Queue<TreeNode>q=new LinkedList<>();
        // int level=0;
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int n=q.size();
        //     TreeNode levelorder[]=new TreeNode[n];
        //     int i=0;
        //     while(n-->0){
        //         TreeNode node=q.poll();
        //           levelorder[i]=node;
        //           i++;
        //           if(node.left!=null){
        //             q.offer(node.left);
        //           }
        //           if(node.right!=null){
        //             q.offer(node.right);
        //           }
        //     }
        //     if(level%2==1){
        //         int l=0;
        //         int r=levelorder.length-1;
        //         while(l<r){
        //             int temp=levelorder[l].val;
        //             levelorder[l].val=levelorder[r].val;
        //             levelorder[r].val=temp;
        //             l++;
        //             r--;
        //         }
        //     }
        //     level++;
        // }
        // return root;

        solve(root.left,root.right,1);
        return root;
    }

    void solve (TreeNode L,TreeNode R,int level){
        if(L==null || R==null){
            return ;
        }

        if(level%2==1){
            int temp=L.val;
            L.val=R.val;
            R.val=temp;
        }
        solve(L.left,R.right,level+1);
        solve(L.right,R.left,level+1);
    }
}