import java.util.*;

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

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        //Write code here
        StringBuilder sb=new StringBuilder();
        preOrder(root,sb);
        return sb.toString();
    }

    public static void preOrder(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("N,");
            return;}
        sb.append(root.val);
        sb.append(",");
        preOrder(root.left,sb);
        preOrder(root.right,sb);
    }

    // Decodes your encoded data to tree.
    static int itr=0;
    public static TreeNode deserialize(String str) {
        //Write code here
        String[] preOrderSplit=str.split(",");
        return constructTree(preOrderSplit);
    }

    public static TreeNode constructTree(String[] preOrderSplit){
        if(itr>=preOrderSplit.length)return null;
        if(preOrderSplit[itr].equals("N")){
            itr++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(preOrderSplit[itr]));
        itr++;
        root.left=constructTree(preOrderSplit);
        root.right=constructTree(preOrderSplit);

        return root;
    }

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        String s = serialize(root);
        display(deserialize(s));
    }

    public static void main(String[] args) {
        solve();
    }
}