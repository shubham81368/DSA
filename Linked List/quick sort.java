
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Main {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        addToTheLast(head);

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            addToTheLast(new Node(a));
        }

        Solution abc=new Solution();
        Node node = abc.quickSort(head);

        printList(node);
        System.out.println();
    
        sc.close();
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}

class Solution {
    
    public static Node quickSort(Node node)
    {
        //Your code here
        if(node==null || node.next==null){
            return node;
        }
        Node pivot=node;
        
        Node temp=node.next;
        Node dl=new Node(-1);
        Node dr=new Node(-1);
        Node tl=dl;
        Node tr=dr;
        while(temp!=null){
            if(temp.data<pivot.data){
                tl.next=temp;
                tl=temp;
                temp=temp.next;
            }
            else{
                tr.next=temp;
                tr=temp;
                temp=temp.next;
            }
        }
        
        tl.next=null;
        tr.next=null;
        Node lefthead=quickSort(dl.next);
        Node righthead=quickSort(dr.next);
        pivot.next=righthead;
        if(lefthead==null){
            return pivot;
        }
        //agar lefthead not null hai 
        Node t=lefthead;
        while(t.next!=null){
            t=t.next;
        }
        t.next=pivot;
        return lefthead;
    }

}