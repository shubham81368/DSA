import java.io.*;
import java.util.*;
 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    
    static void rotateRight(Node head, int n) {
    // Your code here
      if(head==null)return;
       Node tail=head;
       int len=1;
       while(tail.next!=null){
        len++;
        tail=tail.next;
       }
       n=n%len;
    
    if(n==0){
        while(head.next!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        return;}
        Node temp=head;
        for(int i=0;i<len-n-1;i++){
            temp=temp.next;
        }
        Node nNode=temp.next;//new starting head start from temp.next;
        temp.next=null;
        tail.next=head;//ye last node ko start node se link kar diya

        while(nNode!=null){
            System.out.print(nNode.data+" ");
            nNode=nNode.next;
        }
    }
}
public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        int k = sc.nextInt();
        Ob.rotateRight(l1.head, k);
    }
}