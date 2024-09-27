import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        g.binaryTreeZigZagTraversal(root1);
    }
}


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public static void binaryTreeZigZagTraversal(Node root) {
        // Your code here
        if(root==null)return;
        Queue<Node>q=new ArrayDeque<>();
        int level=0;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer>currNode=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node frontNode=q.remove();
                currNode.add(frontNode.data);
                    if(frontNode.left!=null){
                        q.add(frontNode.left);
                    }
                    if(frontNode.right!=null){
                        q.add(frontNode.right);
                    }
            }
            if(level%2==0){
                for(int i=0;i<currNode.size();i++){
                    System.out.print(currNode.get(i)+" ");
                }
            }
            else{
                for(int i=currNode.size()-1;i>=0;i--){
                    System.out.print(currNode.get(i)+" ");
                }
            }
            level++;
        }
    }
}