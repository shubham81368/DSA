import java.util.*;

class Node {
    int val;
    Node prev;
    Node next;
    Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    void append(int val) {
        Node newNode = new Node(val);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.length++;
    }

    void prepend(int val) {
        Node newNode = new Node(val);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.prev = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }
    
   void delete(Node node){
    if(this.length==1){
        //agar ek he node hai linked list me
        this.head=null;
        this.tail=null;
    }
    else if(node==this.head){
        //agar delete node head node ke equal hai
        this.head=this.head.next;
        this.head.prev=null;
    }
    else if(node==this.tail){
        //agar delete node equal hai last node ke
        this.tail=this.tail.prev;
        this.tail.next=null;
    }
    else{
        //agar delete node in between hai
        Node p=node.prev;
        Node f=node.next;
        p.next=f;
        f.prev=p;
    }
    this.length--;
   }

    void printList() {
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class Solution{
    public static DoublyLinkedList deleteNodeWithX(DoublyLinkedList linkedList, int x){
        //Write your code here
        Node head=linkedList.head;
        Node temp=head;
        while(temp!=null){
            if(temp.val==x){
                linkedList.delete(temp);
//yahan obeject se call hoga kyoki hamara method dusri class me hai
            }
            temp=temp.next;
        }
        return linkedList;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        DoublyLinkedList linkedList = new DoublyLinkedList();
        for(int i=0; i<N; i++){
            linkedList.append(sc.nextInt());
        }
        Solution Obj = new Solution();
        linkedList = Obj.deleteNodeWithX(linkedList,M);
        linkedList.printList();

    }
}