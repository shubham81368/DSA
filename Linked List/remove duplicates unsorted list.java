  public Node removeDuplicates(Node head) {
        // Your code here
        if(head==null)return null;
        Node curr=head;
        HashSet<Integer>mp=new HashSet<>();
        mp.add(curr.data);
        while(curr!=null && curr.next!=null){
            if(mp.contains(curr.next.data)){
                curr.next=curr.next==null?null:curr.next.next;
            }
            else{
                 mp.add(curr.next.data);
                curr=curr.next;
               
            }
        }
        return head;
    }