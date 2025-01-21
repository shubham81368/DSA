  public static Node reverseKGroup(Node head, int k) {
        // code here
       int n=length(head);
       Node ansHead=null;
       Node prevHead=null;
       Node currHead=head;
       int gp=n/k;
       for(int i=0;i<gp;i++){
           Node prev=null;
           Node nextNode=null;
           Node curr=currHead;
           for(int j=0;j<k;j++){
               nextNode=curr.next;
               curr.next=prev;
               prev=curr;
               curr=nextNode;
           }
           if(prevHead==null){
               ansHead=prev;
           }
           else{
               prevHead.next=prev;
           }
           prevHead=currHead;
           currHead=curr;
       }
       
       //ab bina gp wale node ko reverse karna hai
          prevHead.next=reverse(currHead);
          return ansHead;
    }
    
    
    public static int length(Node head){
        Node curr=head;
        int cnt=0;
        while(curr!=null){
            cnt++;
            curr=curr.next;
        }
        return cnt;
    }
    
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }