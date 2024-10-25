import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class Main {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Main ip = new Main();
        int T = 1;
        while (T > 0) {
            int n = sc.nextInt();
            int[] inorder = new int[n];
            int[] postorder = new int[n];
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            Solution g = new Solution();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
        sc.close();
    }
}

class Solution {
    Node buildTree(int in[], int post[], int n){
        //Write code here
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(in[i],i);
        }

      Node root=  buildTreePostIn(in,0,in.length-1,post,0,post.length-1,mp);
       return root;
    }


    Node buildTreePostIn(int[] in,int is,int ie,int[] post,int ps,int pe,HashMap<Integer,Integer>mp){
        if(is>ie || ps>pe)return null;

        Node root=new Node(post[pe]);//always start node

        int inRoot=mp.get(post[pe]);
        int numsleft=inRoot-is;

        root.left=buildTreePostIn(in,is,inRoot-1,post,ps,ps+numsleft-1,mp);

        root.right=buildTreePostIn(in,inRoot+1,ie,post,ps+numsleft,pe-1,mp);
        //because last index node crete start bnane me use ho gya

        return root;
    }
}