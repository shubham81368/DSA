class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        ArrayList<Integer>arr=new ArrayList<>();
        helper(root,target,arr);
        
        if(arr.size()<=1)return false;
        
        int s=0;
        int e=arr.size()-1;
        while(s<e){
          int sum=arr.get(s)+arr.get(e);
          if(sum<target){
              s++;
          }
          else if(sum>target){
         e--;
          }
          else{
              return true;
          }
        }
        return false;
        
    }
    
    void helper(Node root,int target,ArrayList<Integer>arr){
        if(root==null)return ;
        helper(root.left,target,arr);
        arr.add(root.data);
        helper(root.right,target,arr);
    }
}