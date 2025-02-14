class Solution {
    void correctBST(Node root) {
        // code here.
        ArrayList<Integer>ans=new ArrayList<>();
        inorder(root,ans);
        Collections.sort(ans);
        swap(root,ans,new int[]{0});
        
    }
    
    
    void inorder(Node root,ArrayList<Integer>ans){
        if(root==null)return ;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    void swap(Node root,ArrayList<Integer>ans,int[] i){
        if(root==null)return ;
        swap(root.left,ans,i);
        
        if(root.data!=ans.get(i[0])){
            root.data=ans.get(i[0]);
            
        }
        i[0]++;
        swap(root.right,ans,i);
        
    }
}