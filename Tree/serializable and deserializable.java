
class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
    
        if(root==null)return new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        helper(root,ans);
        return ans;
        
    }
    
    void helper(Node root,ArrayList<Integer>ans){
        if(root==null){
            ans.add(-1);
            return;
        }
          ans.add(root.data);
        helper(root.left,ans);
              
        helper(root.right,ans);
    }
     int itr=0;

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        if(itr==arr.size()|| arr.get(itr)==-1)return null;
        Node root=new Node(arr.get(itr));
         itr++;
         root.left=deSerialize(arr);
         
         root.right=deSerialize(arr);
         return root;
    }