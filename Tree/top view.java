import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Main {
    static Node buildTree(String str){
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;   
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-- > 0){
			String s = br.readLine();
			Node root = buildTree(s);
			Solution tree = new Solution();
			ArrayList<Integer> arr = tree.topView(root);
			for(int x : arr)
			System.out.print(x +" ");
			System.out.println();  
		}
	}
}
  

class qObj
{
    Node node;
    int level;
    qObj(Node n,int l)
    {
        node=n;
        level=l;
    }
}
class CustomNode{
    Node node;
    int col;
    CustomNode(Node n,int c){
        node=n;
        col=c;
    }
}

class Solution
{
    public ArrayList<Integer> topView(Node root){
        //Write Code here
       ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<CustomNode> que = new LinkedList<>();
        TreeMap<Integer, Integer> mp = new TreeMap<>();

        que.add(new CustomNode(root, 0));

        while (!que.isEmpty()) {
            CustomNode val = que.poll();
            int col = val.col;
            Node node = val.node;

            // If the column is not already in the map, we add the node's value.
            if (!mp.containsKey(col)) {
                mp.put(col, node.data);
            }

            // Move to the left child with column - 1
            if (node.left != null) {
                que.offer(new CustomNode(node.left, col - 1));
            }

            // Move to the right child with column + 1
            if (node.right != null) {
                que.offer(new CustomNode(node.right, col + 1));
            }
        }

        // Collect values from the TreeMap in column order
        for (int val : mp.keySet()) {
            ans.add(mp.get(val));
        }

        return ans;
    }

    public static void inorder(Node root,ArrayList<Integer>ans){
        if(root==null){return;}
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
}

