
class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        int ans[]=new int[1];
        ans[0]=-1;
        inorder(root,new int[]{k},ans);
        return ans[0];
    }
    
    public void inorder(Node root,int[] k,int[] ans){
        if(root==null)return ;
        inorder(root.left,k,ans);
        k[0]--;
        if(k[0]==0){
            ans[0]=root.data;
            return;
        }
        inorder(root.right,k,ans);
    }
    