
class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node nn=new Node(data);
        //if linked list is empty
        if(head==null){
            nn.next=nn;
            return nn;
        }
        
        //if data<head
        Node curr=head;
        if(data<=head.data){
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=nn;
            nn.next=head;
            return nn;
        }
        
        //if data>head
        curr=head;
        while(curr.next!=head && curr.next.data<data){
            curr=curr.next;
        }
        nn.next=curr.next;
        curr.next=nn;
        return head;
    }
}