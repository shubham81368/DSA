/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
   
        int minSwap=0;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
                 ArrayList<Integer>arr=new ArrayList<>();
            while(n-->0){
                TreeNode ele=q.poll();
                arr.add(ele.val);
                if(ele.left!=null){
                    q.offer(ele.left);
                }
                if(ele.right!=null){
                    q.offer(ele.right);
                }
            }
            minSwap+=sort(arr);
        }
        return minSwap;
    }

    int sort(ArrayList<Integer>arr){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            mp.put(arr.get(i),i);
        }
         ArrayList<Integer>dummy=new ArrayList<>(arr);
         Collections.sort(dummy);

          int swap=0;
         for(int i=0;i<arr.size();i++){
            if(arr.get(i).equals(dummy.get(i))){
                continue;
            }
                
            int currIdx=mp.get(dummy.get(i));
            mp.put(arr.get(i),currIdx);
            mp.put(arr.get(currIdx),i);
            Collections.swap(arr,currIdx,i);
            swap++;
         }
            return swap;
    }
}