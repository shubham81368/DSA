class Solution {
    // Function to reverse a circular linked list
    Node reverseLL(Node head) {
        // code here
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    Node reverse(Node head){
        //make single ll from CLL
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=null;//ab ye single ll me convert ho gya
        
        Node original_head=head;
        Node new_head=reverseLL(head);
        original_head.next=new_head;
        return new_head;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        // code here
      Node curr=head.next;//hamm head ke next element se check karenge
      boolean found=false;//abhi key nhi mila hai
      while(curr!=head){//kyoki ye circular linked list hai
          if(curr.data==key)found =true;
          curr=curr.next;
      }
      
      //agar head he key ke equal hai
      if(head.data==key)found=true;
      
      //ab isse pta chal kayga ki key present hai ya nhi
      if(!found)return head;//agar key present nhi hai same result aayega
      
      //agar key present hai to 
      curr=head;
      while(curr.data!=key){
          curr=curr.next;
      }
      //isee hamme position mil jayega ki delete node kha hai par hamme prev ko point karana hai
      Node temp=head;
      while(temp.next!=curr){
          temp=temp.next;
      }
      temp.next=temp.next.next;//isse delete node ka path remove ho jayega;
      
      return head.data==key?head.next:head;
    }
}