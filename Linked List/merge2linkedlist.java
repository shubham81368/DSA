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
 static Node merge(Node x, Node y){
       // Write your code here
       Node arr1=x;
       Node arr2=y;
       Node dummy=new Node(-1);
       Node curr=dummy;
       while(arr1!=null && arr2!=null){
        if(arr1.data<arr2.data){
        Node newNode=new Node(arr1.data);
        curr.next=newNode;
        arr1=arr1.next;
        }
        else{
            Node newNode=new Node(arr2.data);
            curr.next=newNode;
            arr2=arr2.next;
        }
        curr=curr.next;
       }
 
       if(arr1!=null){
        curr.next=arr1;
       }
       if(arr2!=null){
        curr.next=arr2;
       }
       return dummy.next;
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
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for(int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }

        Solution Ob = new Solution();
        Node head = Ob.merge(l1.head, l2.head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}