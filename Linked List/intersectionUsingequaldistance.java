class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        // code here
        Node temp1=head1;
        Node temp2=head2;
        while(true){
            if(temp1==temp2)return temp1.data;
            temp1=temp1.next;
            temp2=temp2.next;
            if(temp1==null && temp2==null)return -1;
            if(temp1==null)temp1=head2;
            if(temp2==null)temp2=head1;
        }
        
    }
}