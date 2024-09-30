/t.c -O(n+m)
//s.c-O(n+m)
//step 1 find inorder of both tree store in list
//step 2 merge the list;
class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer>l1=new ArrayList<>();//o(n);s.c
        List<Integer>l2=new ArrayList<>();//o(m);s.c
        inOrder(root1,l1);//o(n);//sorted order return karenga agar tree me node sorted me hai to
        inOrder(root2,l2);//o(m)
        
        List<Integer>ans=new ArrayList<>(l1.size()+l2.size());
        merge(l1,l2,ans);
        return ans;
    }
    
    
    public void merge(List<Integer>l1,List<Integer>l2,List<Integer>ans){
        int i=0;
        int j=0;
        while(i<l1.size()&&j<l2.size()){
            if(l1.get(i)<l2.get(j)){
                ans.add(l1.get(i));
                i++;
            }else{
                ans.add(l2.get(j));
                j++;
            }
        }
        while(i<l1.size()){
            ans.add(l1.get(i));
            i++;
        }
        while(j<l2.size()){
            ans.add(l2.get(j));
            j++;
        }
        
    }
    
    
    public void inOrder(Node root,List<Integer>l){
        if(root==null)return ;
        
        inOrder(root.left,l);
        l.add(root.data);
        inOrder(root.right,l);
    }
}