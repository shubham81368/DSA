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

    public static TreeNode CreateTree(int n,int[] preOrder) {
        // Write Your Code here
        return bstFromPre(preOrder,Integer.MAX_VALUE,new int[]{0});
    }
    //tc=O(3n)
    //s.c=o(1)but recursive stack space O(n)
    //here i[0] act as index because we cannot pass int as an refernece

    public static TreeNode bstFromPre(int[] A,int bound,int i[]){
     if(i[0]==A.length || A[i[0]]>bound)return null;

     TreeNode root=new TreeNode(A[i[0]++]);
     root.left=bstFromPre(A,root.val,i);
     root.right=bstFromPre(A,bound,i);
     return root;
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
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = CreateTree(n,pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}