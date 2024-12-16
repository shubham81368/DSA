import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

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

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String[] ip = str.split(" ");
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

    // In-order traversal for debugging (optional)
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Solution tree = new Solution();
            ArrayList<Integer> ans = tree.bottomView(root);

            // Printing the output in the required format
            for (Integer num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();  // Print a newline after each test case
        }
    }
}

class CustomNode {
    Node node;
    int col;
    
    CustomNode(Node n, int c) {
        node = n;
        col = c;
    }
}

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        if (root == null) {
            return ans;  // If the tree is empty, return an empty list
        }
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<CustomNode> que = new LinkedList<>();
        que.offer(new CustomNode(root, 0));
        
        while (!que.isEmpty()) {
            CustomNode value = que.poll();
            int col = value.col;
            Node n = value.node;
            
            // The node at this column will be the latest (bottommost) node
            map.put(col, n.data);

            // If left child exists, enqueue it with col-1
            if (n.left != null) {
                que.offer(new CustomNode(n.left, col - 1));
            }
            // If right child exists, enqueue it with col+1
            if (n.right != null) {
                que.offer(new CustomNode(n.right, col + 1));
            }
        }

        // Add all the nodes from the map (which are already sorted by their columns)
        for (int val : map.keySet()) {
            ans.add(map.get(val));
        }
        
        return ans;
    }
}
