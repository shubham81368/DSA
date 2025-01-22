   Node compute(Node head) {
        // your code here
        if(head==null)return null;
        Node curr=reverse(head);
        int max=Integer.MIN_VALUE;
        Node dummy=new Node(-1);
        Node prev=dummy;
        while(curr!=null){
            if(curr.data>=max){
                prev.next=new Node(curr.data);
                prev=prev.next;
                max=curr.data;
            }
            curr=curr.next;
        }
        
        dummy=reverse(dummy.next);
        return dummy;
  
    }
    
    Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }