import java.util.*;
import java.io.*;
class Node{
    int data; 
    Node left, right;
    Node(int key){
        data = key;
        left = right = null;
    }
}

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        int inorder[] = new int[n];
        int preorder[] = new int[n];
        for(int i = 0; i < n; i++)
          preorder[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
          inorder[i] = sc.nextInt();
        Solution ob = new Solution();
        root = ob.buildTree(inorder, preorder, n);
        postOrdrer(root);
        System.out.println();
    }
    
    public static void postOrdrer(Node root){
        if(root == null)
          return;
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}


class Solution{
    public static Node buildTree(int inorder[], int preorder[], int n){
        //Your code here 
        HashMap<Integer,Integer>inorderMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
           inorderMap.put(inorder[i],i);
        }

        return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inorderMap);
    }

    public static Node construct(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,HashMap<Integer,Integer>inorderMap){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
           Node root=new Node(preorder[preStart]);
        int inorder_positon=inorderMap.get(root.data);
        int ele_left=inorder_positon-inStart;
        root.left=construct(preorder,preStart+1,preStart+ele_left,inorder,inStart,inorder_positon-1,inorderMap);
        root.right=construct(preorder,preStart+ele_left+1,preEnd,inorder,inorder_positon+1,inEnd,inorderMap);
        return root;
    }
}
