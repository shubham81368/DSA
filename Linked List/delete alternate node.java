//time complexity =O(n/2)
//s.c complexity=o(1)
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        Node curr=head;
        while(curr!=null && curr.next!=null){
            curr.next=curr.next.next;//event point skip ho jayega
            curr=curr.next;//ab new curr next node pe aa jayega
        }
    }
}