class Solution {
    // Function to append a new node with newData at the end of a linked list
    //time complexity=O(n)
    //space complexity=o(N)
    Node[] alternatingSplitList(Node head) {
        // code here
        Node ans1=new Node(-1);
        
        Node ans2=new Node(-1);
        
        Node curr1=ans1;
        Node curr2=ans2;
        
        Node curr=head;
    
        while(curr!=null){
            
                curr1.next=new Node(curr.data);
                curr1=curr1.next;
                curr=curr.next;
            
            if(curr!=null){
                curr2.next=new Node(curr.data);
                curr2=curr2.next;
                curr=curr.next;
            }
        }
        
        return new Node[]{ans1.next,ans2.next};
        
    }
}
