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
            if (i >= ip.length)
                break;
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node root = buildTree(s);
        Solution tree = new Solution();
        int ans = tree.solve(root);
        System.out.println(ans);

        sc.close();
    }
}
class Pair{
    Node root;
    int num;
    Pair(Node r,int _num){
        root=r;
        num=_num;
    }
}

class Solution {
    //T.c=O(n) & S.c=O(n)

    public int solve(Node root) {
        // your code here
        if(root==null){
            return 0;
        }
        int ans=0;//width count
        Queue<Pair>q=new LinkedList();
        q.add(new Pair(root,0));//offer 
        while(!q.isEmpty()){
            int size=q.size();
            int mmin=q.peek().num;//to make the index starting
            int first=0,last=0;//intailly
            for(int i=0;i<size;i++){
                int cur_id=q.peek().num-mmin;
                Node node=q.peek().root;
                q.poll();//ya phir q.remove()
                if(i==0)first=cur_id;
                if(i==size-1)last=cur_id;
                if(node.left!=null){
                    q.offer(new Pair(node.left,cur_id*2+1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,cur_id*2+2));
                }
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}
