import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int idx=0;

      public static  TreeNode createPostOrder(int[] postOrder,int lr,int rr){
        if(idx<0 || postOrder[idx]<lr || postOrder[idx]>rr)return null;

        TreeNode root=new TreeNode(postOrder[idx--]);

        root.right=createPostOrder(postOrder,root.val,rr);
        root.left=createPostOrder(postOrder,lr,root.val);

        return root;
    }
    public static TreeNode CreateTree(int n,int[] postOrder) {
        //write code here
        int lr=-(int)1e9-1;
        int rr=(int)1e9+1;
        idx=postOrder.length-1;
        return createPostOrder(postOrder,lr,rr);
    }

  

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null) return;
        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append("->" + node.val + "<-");
        sb.append((node.right != null ? node.right.val : "."));
        System.out.println(sb.toString());
        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] post = new int[n];
        for (int i = 0; i < n; i++)
            post[i] = scn.nextInt();

        TreeNode root = CreateTree(n,post);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}