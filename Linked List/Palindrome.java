class Solution {
    
    //reverse linked list
    Node reverse(Node head){
        if(head==null|| head.next==null)return head;
        
       Node newHead= reverse(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        if(head==null||head.next==null)return true;
     //first find middle
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reveerse the second half
        Node newHead=reverse(slow.next);
        
        //compare first half and second half
        Node first=head;
        Node second=newHead;
        while(second!=null){
            if(first.data!=second.data){
                //ham linked list ko waisa he kar denge jaisa pahle tha
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        //agar true result aa rha hoga to link list ko pahele haise kar denge
        reverse(newHead);
        return true;
    }
}