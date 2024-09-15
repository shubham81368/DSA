class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node head;
	Node prev;
    Node bToDLL(Node root)
    {
	//  Your code here	
	   head=null;
	   prev=null;
	   DLL(root);
	   return head;
    }
    
    void DLL(Node root){
        if(root==null)return;
        //left me jayenge
        DLL(root.left);
        if(prev==null){
            head=root;
        }
        else{
            prev.right=root;
            root.left=prev;
        }
        prev=root;
        DLL(root.right);
    }
}