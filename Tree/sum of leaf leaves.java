import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.lang.*;

class Solution {
    
    int SumLeftLeaves(TreeNode root) {
        //Write your code here
        if(root==null)return 0;
           return getSum(root,false);
    }
    int getSum(TreeNode root,boolean isLeft){
        if(root.left==null && root.right==null){
            return isLeft?root.data:0;
        }
        int sum=0;
        if(root.left!=null){
            sum+=getSum(root.left,true);
        }
        if(root.right!=null){
            sum+=getSum(root.right,false);
        }
        return sum;
    }
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Main {

    static TreeNode buildTree(String str) {
        if(str.length()==0 || str.charAt(0)=='N')
            return null;

        String ip[] = str.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(ip[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            TreeNode currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t > 0){
            String s = br.readLine();
            TreeNode root = buildTree(s);
            Solution ob = new Solution();
            int ans = ob.SumLeftLeaves(root);
            System.out.println(ans);
            t--;
        }
    }
}