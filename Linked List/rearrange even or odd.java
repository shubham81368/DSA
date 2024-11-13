import java.util.*;

class Node {
    int val;
    Node next;

    Node(int d) {
        val = d;
        next = null;
    }
}

class LinkedList {
    Node head, tail;

    void push(Node new_node) {
        if (head == null && tail == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {
    public Node rearrangeList(Node head) {
        //Write code here
        Node dummy1=new Node(-1);
        Node curr=head;
        Node even=null;

       
        Node dummy2=new Node(-1);
           Node odd=null;
        

        while(curr!=null){
            if(curr.val%2==0){
                if(even==null){
                    even=new Node(curr.val);
                    dummy1.next=even;
                }
                else{
                    even.next=new Node(curr.val);
                    even=even.next;
                }
            }
            else{
                if(odd==null){
                    odd=new Node(curr.val);
                    dummy2.next=odd;
                }
                else{
                    odd.next=new Node(curr.val);
                    odd=odd.next;
                }
            }
                curr=curr.next;
            
        }
        if(dummy1.next!=null){
            even.next=dummy2.next;
        }
        if(dummy1.next==null)return dummy2.next;
        
        return dummy1.next;

    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist = new LinkedList();
        int h1 = sc.nextInt();
        Node head = new Node(h1);
        llist.push(head);
        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            llist.push(new Node(data));
        }
        // llist.printList(head);
        Solution Obj = new Solution();
        head = Obj.rearrangeList(head);
        llist.printList(head);
        sc.close();
    }
}