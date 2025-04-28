class Solution {
    // Function to return the maximum sum of non-adjacent nodes.
    Map<Node,Integer>mp=new HashMap<>();
    public int getMaxSum(Node root) {
        // code here
        if(root==null)return 0;
        
        if(mp.containsKey(root))return mp.get(root);
        int include=root.data;
        int exclude=0;
        
        //agar take karenge to root ke left child  or right child ko nhi le skate par usnke child ko le sakete hai
        
        if(root.left!=null){
            include+=getMaxSum(root.left.left);
            include+=getMaxSum(root.left.right);
        }
        
        if(root.right!=null){
            include+=getMaxSum(root.right.left);
            include+=getMaxSum(root.right.right);
        }
        //agar parent ko nhi le rahe to left or right child ko lenge
        exclude=getMaxSum(root.left)+getMaxSum(root.right);
        int ans=Math.max(include,exclude);
        mp.put(root,ans);
        return ans;
    }
}