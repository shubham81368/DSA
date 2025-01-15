  ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        if(node==null)return new ArrayList<>();
        
        ArrayList<Integer>ans=new ArrayList<>();
        if(!isLeaf(node)){
        ans.add(node.data);}
        insertLeftBoundry(node,ans);
        insertLeafNode(node,ans);
        insertRightBoundry(node,ans);
        return ans;
    }
    
    void insertLeftBoundry(Node node,ArrayList<Integer>ans){
        Node leftNode=node.left;
        while(leftNode!=null){
            if(isLeaf(leftNode)){
                break;
            }
            ans.add(leftNode.data);
            if(leftNode.left!=null){
                leftNode=leftNode.left;
            }
            else{
                leftNode=leftNode.right;
            }
        }
        
    }
    
    void insertRightBoundry(Node node,ArrayList<Integer>ans){
        Stack<Integer>st=new Stack<>();
        Node RightNode=node.right;
        while(RightNode!=null){
            if(isLeaf(RightNode)){
                break;
            }
            st.push(RightNode.data);
            if(RightNode.right!=null){
                RightNode=RightNode.right;
            }
            else{
                RightNode=RightNode.left;
            }
        }
        
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
    }
    
    void insertLeafNode(Node node,ArrayList<Integer>ans){
        if(node==null){
            return ;
        }
        if(isLeaf(node)){
            ans.add(node.data);
        }
        
        insertLeafNode(node.left,ans);
        insertLeafNode(node.right,ans);
    }
    
    
     boolean isLeaf(Node node){
        return (node.left==null && node.right==null);
    }