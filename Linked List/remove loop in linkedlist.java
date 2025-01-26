 public static void removeLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)break;
        }
        
        //now check karenge loop hai ya nhi
        if(fast==null || fast.next==null)return;
        
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        while(slow.next!=fast){
            slow=slow.next;
        }
        slow.next=null;
    }